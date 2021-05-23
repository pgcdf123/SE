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
    public int register(int id, String GUID, String password) {
        User user = new Administrator();
        user.setId(id);
        user.setGUID(GUID);
        user.setPassword(password);
        userService.register(user);
        return id;
    }

    @Override
    public User login(String GUID, String password) {
        User user = userMapper.findByGUID(GUID);
        if(user != null){
            System.out.println("welcome");
            return user;
        }else{
            System.out.println("false");
            return null;
        }
    }

}
