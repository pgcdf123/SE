package controller.impl;

import controller.ClassDirectorController;
import entity.RecruitmentList;
import entity.User;
import service.impl.ClassDirectorServiceImpl;
import service.ClassDirectorService;

import java.util.Scanner;

public class ClassDirectorControllerImpl implements ClassDirectorController {

    ClassDirectorService classDirectorService = new ClassDirectorServiceImpl();
    private User user;

    public ClassDirectorControllerImpl(User user){
        this.user = user;
    }

    @Override
    public void enterRecruitmentList(){
        RecruitmentList recruitmentList = new RecruitmentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new recruitment list...\nPlease enter the Subject:");
        recruitmentList.setSubject(sc.nextLine());
        recruitmentList.setGUID(user.getGUID());

        classDirectorService.uploadRecruitmentList(recruitmentList);
    }
}
