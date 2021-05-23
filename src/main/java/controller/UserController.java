package controller;

import entity.User;

public interface UserController {

    int register(int id, String GUID, String password);

    User login(String GUID, String password);
}
