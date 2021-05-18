package service.impl;

import dao.UserMapper;
import dao.impl.UserMapperImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    UserMapper userMapper = new UserMapperImpl();

    @Override
    public void register(User user) {
        userMapper.addUser(user);
    }

    @Override
    public User login(String GUID, String password) {
        return userMapper.findByGUID(GUID);
    }
}
