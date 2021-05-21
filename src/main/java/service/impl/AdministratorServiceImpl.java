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

public class AdministratorServiceImpl implements AdministratorService {

    RecruitmentListMapper recruitmentListMapper = new RecruitmentListMapperImpl();
    UserMapper userMapper = new UserMapperImpl();
    TrainingListMapper trainingListMapper = new TrainingListMapperImpl();


    @Override
    public RecruitmentList downloadRecruitmentList() {

        return recruitmentListMapper.downloadRecruitmentList();
    }

    @Override
    public CandidateTeacher chooseCandidateTeacher(String GUID) {
        return (CandidateTeacher) userMapper.findByGUID(GUID);
    }

    @Override
    public void uploadTrainingList(TrainingList trainingList) {
        trainingListMapper.uploadTrainingList(trainingList);
    }

    @Override
    public TrainingList downloadTrainingList() {
        return trainingListMapper.downloadTrainingList();
    }

}
