package controller.impl;

import controller.ClassDirectorController;
import entity.RecruitmentList;
import service.impl.ClassDirectorServiceImpl;

import java.util.Scanner;

public class ClassDirectorControllerImpl implements ClassDirectorController {
    @Override
    public void enterRecruitmentList(){
        RecruitmentList recruitmentList = new RecruitmentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new recruitment list...\nPlease enter the Subject:");
        recruitmentList.setSubject(sc.nextLine());
        System.out.println("Please enter the Requirements:");
        recruitmentList.setRequirement(sc.nextLine());

        ClassDirectorServiceImpl classDirectorServiceImpl = new ClassDirectorServiceImpl();
        classDirectorServiceImpl.uploadRecruitmentList(recruitmentList);
    }
}
