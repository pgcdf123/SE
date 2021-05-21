package controller.impl;

import controller.CandidateTeacherController;
import entity.TrainingList;
import entity.User;
import service.impl.CandidateTeacherServiceImpl;
import service.CandidateTeacherService;

import java.util.List;

public class CandidateTeacherControllerImpl implements CandidateTeacherController {

    /**CandidateTeacherService candidateTeacherService = new CandidateTeacherServiceImpl();
    private User user;

    public CandidateTeacherControllerImpl(User user){
        this.user = user;
    }

    public void showTrainingList(){
        TrainingList trainingList = candidateTeacherService.downloadTrainingList(user.getGUID());
        List<String> subject = trainingList.getSubject();
        System.out.println("Your training list is:");
        for(String it:subject){
            System.out.println(it);
        }
    }*/
}
