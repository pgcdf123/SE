package dao.impl;

import dao.TrainingListMapper;
import entity.TrainingList;
import utils.FileLoader;
import utils.JsonData;

public class TrainingListMapperImpl implements TrainingListMapper {


    public void uoloadTrainingList(TrainingList trainingList) {
        JsonData.GetCandidateTeacher().add(trainingList);
    }

    public TrainingList downloadTrainingList(String GUID)
    {
        TrainingList result=null;
        for(TrainingList list:JsonData.GetCandidateTeacher())
        {
            if(list.getGUID().equals(GUID))
            {
                result=list;
            }
        }
        return result;
    }
    /**下载全部注册*/
    public void downloadAllTraining()
    {
        JsonData.commit();
    }
}
