import controller.CandidateTeacherController;
import controller.ClassDirectorController;
import controller.UserController;
import controller.impl.AdministratorControllerImpl;
import controller.impl.CandidateTeacherControllerImpl;
import controller.impl.ClassDirectorControllerImpl;
import controller.impl.UserControllerImpl;
import dao.UserMapper;
import dao.impl.RecruitmentListMapperImpl;
import dao.impl.UserMapperImpl;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.User;
import entity.userimpl.Administrator;
import entity.userimpl.CandidateTeacher;
import entity.userimpl.ClassDirector;
import service.impl.ClassDirectorServiceImpl;
import utils.FileLoader;
import utils.JsonData;
import controller.AdministratorController;

import java.util.ArrayList;
import java.util.List;
/**All information will be stored in the Dir:resources
 * Account.json
 * Requirement.json
 * Training.json
 * */
public class UserTest {
    /**Loads all information into the memory
     * All information will be stored in these three list unitl the System closed or using the method JsonData.commit
     * to load all information into json doc.
     * */
    public static void main(String[] args) {
        JsonData.GetUserAccount();
        JsonData.GetCandidateTeacher();
        JsonData.GetClassDirector();
        /**
         * userservice
         */
        UserController userController = new UserControllerImpl();
        userController.register(1,"glasgow","123456");

        /**
         * teacher
         */
        CandidateTeacherController candidateTeacherController = new CandidateTeacherControllerImpl("00013");
        candidateTeacherController.showTrainingList();
        /**
         * Administrator
         */
        AdministratorController administratorController = new AdministratorControllerImpl();
        TrainingList mTrainingList = new TrainingList();
        mTrainingList.setGUID("glasgow_2");
        List<String> mList = new ArrayList<String>();
        mList.add("math");
        mTrainingList.setSubject(mList);
        administratorController.uploadTrainingList(mTrainingList);
        administratorController.downloadTrainingList("glasgow_2");
        /**Class Director*/
        ClassDirectorController classDirectorController=new ClassDirectorControllerImpl();
        classDirectorController.enterRecruitmentList();
        for(RecruitmentList directors:JsonData.GetClassDirector())
        {
            System.out.println(directors.getSubject()+" "+"The quantity: "+directors.getQuantity());
        }

    }
}
