package controller.impl;

import controller.CandidateTeacherController;
import entity.TrainingList;
import service.impl.CandidateTeacherServiceImpl;
import service.CandidateTeacherService;

import java.util.Scanner;

public class CandidateTeacherControllerImpl implements CandidateTeacherController {

    CandidateTeacherService candidateTeacherService = new CandidateTeacherServiceImpl();

    @Override
    public void showTrainingList(){
        TrainingList trainingList = candidateTeacherService.downloadTrainingList();
        System.out.println("Your training list is: " + trainingList.getTrainingList());
    }
}
