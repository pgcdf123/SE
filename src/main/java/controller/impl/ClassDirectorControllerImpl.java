package controller.impl;

import controller.ClassDirectorController;
import entity.RecruitmentList;
import service.impl.ClassDirectorServiceImpl;
import service.ClassDirectorService;

import java.util.Scanner;

public class ClassDirectorControllerImpl implements ClassDirectorController {

    ClassDirectorService classDirectorService = new ClassDirectorServiceImpl();

    @Override
    public void enterRecruitmentList(){
        RecruitmentList recruitmentList = new RecruitmentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new recruitment list...\nPlease enter the Subject:");
        recruitmentList.setSubject(sc.nextLine());
        System.out.println("Please enter the Requirements:");
        recruitmentList.setRequirement(sc.nextLine());

        classDirectorService.uploadRecruitmentList(recruitmentList);
    }
}
