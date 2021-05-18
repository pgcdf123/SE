package service;

import entity.User;

public interface UserService {

    void register(User user);

    User login(String GUID, String password);


}
