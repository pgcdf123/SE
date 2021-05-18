package controller.impl;

import controller.UserController;
import dao.UserMapper;
import dao.impl.UserMapperImpl;
import entity.User;
import entity.userimpl.Administrator;
import entity.userimpl.CandidateTeacher;
import entity.userimpl.ClassDirector;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserControllerImpl implements UserController {

    UserService userService = new UserServiceImpl();
    UserMapper userMapper = new UserMapperImpl();

    @Override
    public void register(int id, String GUID, String password) {
        if(id == 1){
            User user = new Administrator();
            user.setId(id);
            user.setGUID(GUID);
            user.setPassword(password);
            userService.register(user);
            System.out.println("Administrator, register successfully");
        }else if (id == 2){
            User user = new CandidateTeacher();
            user.setId(id);
            user.setGUID(GUID);
            user.setPassword(password);
            userService.register(user);
            System.out.println("CandidateTeacher, register successfully");
        }else if(id == 3){
            User user = new ClassDirector();
            user.setId(id);
            user.setGUID(GUID);
            user.setPassword(password);
            userService.register(user);
            System.out.println("ClassDirector, register successfully");
        }else {
            System.out.println("registration failed");
        }
    }

    @Override
    public void login(String GUID, String password) {
        if(userMapper.findByGUID(GUID) != null){
            System.out.println("welcome");
        }else{
            System.out.println("false");
        }
    }
}
