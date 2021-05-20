package controller;

import entity.User;

public interface UserController {

    void register(int id, String GUID, String password);

    User login(String GUID, String password);
}
