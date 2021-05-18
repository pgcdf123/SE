package controller.impl;

import controller.CandidateTeacherController;
import entity.Application;
import entity.TrainingList;
import service.impl.CandidateTeacherServiceImpl;

import java.util.Scanner;

public class CandidateTeacherControllerImpl implements CandidateTeacherController {

    public void enterApplication(){
        Application application = new Application();
        System.out.println("Creating a new application...\nPlease enter your GUID:");
        Scanner sc = new Scanner(System.in);
        application.setGUID(sc.nextInt());
        System.out.println("Please enter your expected salary:");
        application.setExpectedsalary(sc.nextInt());

        CandidateTeacherServiceImpl candidateTeacherServiceImpl = new CandidateTeacherServiceImpl();
        candidateTeacherServiceImpl.submitApplication(application);
    }
    public void showTrainingList(){
        CandidateTeacherServiceImpl candidateTeacherServiceImpl = new CandidateTeacherServiceImpl();
        TrainingList trainingList = candidateTeacherServiceImpl.downloadTrainingList();
        System.out.println("Your training list is: " + trainingList.getTrainingList());
    }
}
