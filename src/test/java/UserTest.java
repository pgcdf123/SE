import controller.CandidateTeacherController;
import controller.UserController;
import controller.impl.AdministratorControllerImpl;
import controller.impl.CandidateTeacherControllerImpl;
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

public class UserTest {
    public static void main(String[] args) {
        /**
         * userservice
         */
//        UserController userController = new UserControllerImpl();
//        userController.register(1,"glasgow","123456");

        /**
         * teacher
         */
//        CandidateTeacherController candidateTeacherController = new CandidateTeacherControllerImpl(userController.login("00008",""));
//        candidateTeacherController.showTrainingList();
        /**
         * Administrator
         */
        AdministratorController administratorController = new AdministratorControllerImpl();
//        TrainingList mTrainingList = new TrainingList();
//        mTrainingList.setGUID("glasgow_2");
//        List<String> mList = new ArrayList<String>();
//        mList.add("math");
//        mTrainingList.setSubject(mList);
//        administratorController.uploadTrainingList(mTrainingList);
        administratorController.downloadTrainingList("glasgow");
    }
}
