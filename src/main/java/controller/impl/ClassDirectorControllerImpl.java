package controller.impl;

import controller.ClassDirectorController;
import entity.RecruitmentList;
import entity.User;
import service.impl.ClassDirectorServiceImpl;
import service.ClassDirectorService;
import utils.JsonData;

import java.util.Scanner;

public class ClassDirectorControllerImpl implements ClassDirectorController {

    ClassDirectorService classDirectorService = new ClassDirectorServiceImpl();
    private User user;

    public ClassDirectorControllerImpl(String GUID){
        user=JsonData.findByID(GUID);
    }

    public void enterRecruitmentList(){
        RecruitmentList recruitmentList = new RecruitmentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new recruitment list...\nPlease enter the Subject:");
        recruitmentList.setSubject(sc.nextLine());
        System.out.println("please input the quantity of teachers that you want to employ");
        recruitmentList.setQuantity(sc.nextInt());
        recruitmentList.setGUID(user.getGUID());
        sc.close();
        classDirectorService.uploadRecruitmentList(recruitmentList);
    }
}
