package view;

public interface UserView {
    void register(int id,String GUID,String password);

    void login(String GUID,String password);
}
