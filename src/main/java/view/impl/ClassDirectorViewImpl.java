package view.impl;

import controller.ClassDirectorController;
import controller.impl.ClassDirectorControllerImpl;
import entity.RecruitmentList;
import utils.JsonData;

public class ClassDirectorViewImpl implements ClassDirectorView {
    ClassDirectorController classDirectorController;
    public ClassDirectorViewImpl (String GUID)
    {
        classDirectorController=new ClassDirectorControllerImpl(GUID);
    }
    @Override
    public void enterRecruitmentList() {
        classDirectorController.enterRecruitmentList();
        for(RecruitmentList directors: JsonData.GetClassDirector())
        {
            System.out.println(directors.getGUID()+": "+directors.getSubject()+" "+"The quantity: "+directors.getQuantity());
        }
    }
}
