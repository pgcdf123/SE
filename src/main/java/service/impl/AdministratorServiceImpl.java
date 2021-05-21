package service.impl;

import dao.RecruitmentListMapper;
import dao.TrainingListMapper;
import dao.UserMapper;
import dao.impl.RecruitmentListMapperImpl;
import dao.impl.TrainingListMapperImpl;
import dao.impl.UserMapperImpl;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.userimpl.CandidateTeacher;
import service.AdministratorService;
import utils.JsonData;

public class AdministratorServiceImpl implements AdministratorService {

    RecruitmentListMapper recruitmentListMapper = new RecruitmentListMapperImpl();
    UserMapper userMapper = new UserMapperImpl();
    TrainingListMapper trainingListMapper = new TrainingListMapperImpl();


    @Override
    public RecruitmentList downloadRecruitmentList(String GUID) {

        return recruitmentListMapper.downloadRecruitmentList(GUID);
    }

    @Override
    public CandidateTeacher chooseCandidateTeacher(String GUID) {
        return (CandidateTeacher) userMapper.findByGUID(GUID);
    }

    @Override
    public void uploadTrainingList(TrainingList trainingList) {

        trainingListMapper.uploadTrainingList(trainingList);
        JsonData.commit();
    }

    @Override
    public TrainingList downloadTrainingList(String GUID) {
        return trainingListMapper.downloadTrainingList(GUID);
    }

}
