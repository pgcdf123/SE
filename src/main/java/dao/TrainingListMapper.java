package dao;

import entity.TrainingList;

public interface TrainingListMapper {

    void uoloadTrainingList(TrainingList trainingList);

    TrainingList downloadTrainingList();
}
