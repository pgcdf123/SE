package service.impl;

import dao.impl.TrainingListMapperImpl;
import entity.TrainingList;
import service.CandidateTeacherService;

public class CandidateTeacherServiceImpl implements CandidateTeacherService {

    TrainingListMapperImpl trainingListMapperImpl = new TrainingListMapperImpl();


    @Override
    public TrainingList downloadTrainingList(){
        return trainingListMapperImpl.downloadTrainingList();
    }
}
