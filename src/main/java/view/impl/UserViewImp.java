package view.impl;

import controller.UserController;
import controller.impl.UserControllerImpl;

public class UserViewImp implements UserView {
    private UserController userController = new UserControllerImpl();
    @Override
    public void register(int id, String GUID, String password) {
        int i=0;
        try
        {
            i=userController.register(id,GUID,password);
            if(i== 1){
                System.out.println("Administrator, register successfully");
            }else if (i == 2){

                System.out.println("CandidateTeacher, register successfully");
            }else if(i == 3){

                System.out.println("ClassDirector, register successfully");
            }else {
                System.out.println("registration failed");
            }
        }
        catch (Exception e)
        {
            System.out.println("Something wrong");
        }


    }
    @Override
    public void login(String GUID, String password) {
        System.out.println("Login successfully your id is : "+userController.login(GUID,password).getId());

    }
}
