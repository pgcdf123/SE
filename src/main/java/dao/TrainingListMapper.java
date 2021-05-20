package dao;

import entity.TrainingList;

public interface TrainingListMapper {

    void uploadTrainingList(TrainingList trainingList);

    TrainingList downloadTrainingList(String GUID);
    void downloadAllTraining();

}
