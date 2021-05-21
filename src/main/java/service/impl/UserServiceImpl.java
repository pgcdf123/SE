package service.impl;

import dao.UserMapper;
import dao.impl.UserMapperImpl;
import entity.User;
import service.UserService;
import utils.JsonData;

public class UserServiceImpl implements UserService {

    UserMapper userMapper = new UserMapperImpl();

    public void register(User user) {
        userMapper.addUser(user);
        JsonData.commit();
    }


    public User login(String GUID, String password) {
        return userMapper.findByGUID(GUID);
    }
}
