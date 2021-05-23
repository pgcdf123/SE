package view.impl;

import controller.CandidateTeacherController;
import controller.impl.CandidateTeacherControllerImpl;

import java.util.List;

public class CandidateTeacherViewImpl implements CandidateTeacherView {
    private CandidateTeacherController candidateTeacherController ;
    public CandidateTeacherViewImpl(String GUID)
    {
        candidateTeacherController= new CandidateTeacherControllerImpl(GUID);
    }
    @Override
    public void showTrainingList() {
        List<String>subjects=candidateTeacherController.showTrainingList();
        System.out.println("Your training list is:");
        for(String str:subjects)
        {
            System.out.print(str+",  ");
        }

    }
}
