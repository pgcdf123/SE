package dao;

import entity.User;

public interface UserMapper {

    boolean addUser(User user);

    User findByGUID(String GUID);

}
