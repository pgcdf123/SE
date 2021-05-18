package service;


import entity.Application;
import entity.TrainingList;

import java.util.HashMap;

public interface CandidateTeacherService {

    void submitApplication(Application application);

    TrainingList downloadTrainingList();

}
