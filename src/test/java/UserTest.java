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
import view.AdministratorView;
import view.CandidateTeacherView;
import view.ClassDirectorView;
import view.UserView;
import view.impl.AdministratorViewImp;
import view.impl.CandidateTeacherViewImpl;
import view.impl.ClassDirectorViewImpl;
import view.impl.UserViewImp;

import java.util.ArrayList;
import java.util.List;
/**All information will be stored in the Dir:resources
 * Account.json
 * Requirement.json
 * Training.json
 * */
public class UserTest {
    public static void start()
    {
        JsonData.GetUserAccount();
        JsonData.GetCandidateTeacher();
        JsonData.GetClassDirector();
    }
    /**Loads all information into the memory
     * All information will be stored in these three list unitl the System closed or using the method JsonData.commit
     * to load all information into json doc.
     * */
    public static void main(String[] args) {
        start();
        /**
         * userservice
         */
        //UserView userview=new UserViewImp();
        //userview.register(1,"glasgow","123456");
        //login
        //userview.login("glasgow","123456");

        /**
         * teacher
         */
       // CandidateTeacherView CandidateView = new CandidateTeacherViewImpl("00013");
       // CandidateView.showTrainingList();
        /**
         * Administrator
         */
         //List<String> mList = new ArrayList<String>();
        // mList.add("math");
        // AdministratorView administratorView = new AdministratorViewImp();
        // administratorView.uploadTrainingList("00015",mList);
         //administratorView.downloadTrainingList("00015");

        /**Class Director:
         * upload requirement*/
        ClassDirectorView classDirectorView=new ClassDirectorViewImpl("00006");
        classDirectorView.enterRecruitmentList();
    }
}
