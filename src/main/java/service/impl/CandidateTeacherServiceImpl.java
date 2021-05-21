package service.impl;

import dao.impl.TrainingListMapperImpl;
import entity.TrainingList;
import service.CandidateTeacherService;

public class CandidateTeacherServiceImpl implements CandidateTeacherService {

    TrainingListMapperImpl trainingListMapperImpl = new TrainingListMapperImpl();


    public TrainingList downloadTrainingList(String GUID) {
        return trainingListMapperImpl.downloadTrainingList(GUID);
    }
}