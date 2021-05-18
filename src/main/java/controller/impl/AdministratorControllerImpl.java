package controller.impl;

import controller.AdministratorController;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.userimpl.CandidateTeacher;
import service.AdministratorService;
import service.impl.AdministratorServiceImpl;


public class AdministratorControllerImpl implements AdministratorController {

    AdministratorService administratorService = new AdministratorServiceImpl();

    @Override
    public RecruitmentList downloadRecruitmentList() {
        return administratorService.downloadRecruitmentList();
    }

    @Override
    public CandidateTeacher chooseCandidateTeacher(String GUID) {
        return administratorService.chooseCandidateTeacher(GUID);
    }

    @Override
    public void uploadTrainingList(TrainingList trainingList) {
        administratorService.uploadTrainingList(trainingList);
    }

    @Override
    public TrainingList downloadTrainingList() {
        return administratorService.downloadTrainingList();
    }
}
