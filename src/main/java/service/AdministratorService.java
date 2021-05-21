package service;

import entity.RecruitmentList;
import entity.TrainingList;
import entity.userimpl.CandidateTeacher;

public interface AdministratorService {

    RecruitmentList downloadRecruitmentList(String GUID);

    CandidateTeacher chooseCandidateTeacher(String GUID);

    void uploadTrainingList(TrainingList trainingList);

    TrainingList downloadTrainingList(String GUID);

}
