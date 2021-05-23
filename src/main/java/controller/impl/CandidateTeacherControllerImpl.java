package controller.impl;

import controller.CandidateTeacherController;
import entity.TrainingList;
import entity.User;
import service.impl.CandidateTeacherServiceImpl;
import service.CandidateTeacherService;
import utils.JsonData;

import java.util.List;

public class CandidateTeacherControllerImpl implements CandidateTeacherController {

    CandidateTeacherService candidateTeacherService = new CandidateTeacherServiceImpl();
    private User user;

    public CandidateTeacherControllerImpl(String GUID){
        user= JsonData.findByID(GUID);
    }

    public List<String > showTrainingList(){
        TrainingList trainingList = candidateTeacherService.downloadTrainingList(user.getGUID());
        List<String> subject = trainingList.getSubject();
        return subject;
    }
}
