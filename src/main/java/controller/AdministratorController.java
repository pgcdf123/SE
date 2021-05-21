package controller;

import entity.RecruitmentList;
import entity.TrainingList;
import entity.userimpl.CandidateTeacher;

public interface AdministratorController {

   RecruitmentList downloadRecruitmentList();

    CandidateTeacher chooseCandidateTeacher(String GUID);

    void uploadTrainingList(TrainingList trainingList);

    TrainingList downloadTrainingList();

}
