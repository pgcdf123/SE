package view.impl;

import controller.AdministratorController;
import controller.impl.AdministratorControllerImpl;
import entity.TrainingList;

import java.util.List;

public class AdministratorViewImp implements AdministratorView {
    AdministratorController administratorController = new AdministratorControllerImpl();
    TrainingList mTrainingList;
    @Override
    public void downloadTrainingList(String GUID) {
        try
        {
            administratorController.downloadTrainingList(GUID);
            System.out.println("download successfully");
        }
        catch (Exception e)
        {
            System.out.println("download failed");
        }

    }

    @Override
    public void uploadTrainingList(String GUID, List<String> subjects) {
        try
        {
            mTrainingList= new TrainingList();
            mTrainingList.setGUID(GUID);
            mTrainingList.setSubject(subjects);
            administratorController.uploadTrainingList(mTrainingList);
            System.out.println("upload successfully");
        }catch (Exception e)
        {
            System.out.println("upload Failed");
        }

    }
}
