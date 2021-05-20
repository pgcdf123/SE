package service.impl;

import dao.ApplicationMapper;
import dao.impl.ApplicationMapperImpl;
import dao.impl.TrainingListMapperImpl;
import entity.Application;
import entity.TrainingList;
import service.CandidateTeacherService;

public class CandidateTeacherServiceImpl implements CandidateTeacherService {

    ApplicationMapper applicationMapper = new ApplicationMapperImpl();
    TrainingListMapperImpl trainingListMapperImpl = new TrainingListMapperImpl();

    @Override
    public void submitApplication(Application application) {
        applicationMapper.submitApplication(application);
    }

    @Override
    public TrainingList downloadTrainingList(){
        return trainingListMapperImpl.downloadTrainingList();
    }