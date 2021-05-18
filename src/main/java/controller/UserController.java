package controller;

public interface UserController {

    void register(int id, String GUID, String password);

    void login(String GUID, String password);
}
