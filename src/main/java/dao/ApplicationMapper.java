package dao;

public interface ApplicationMapper {

    Application findApplicationByGUID(String GUID);

    void submitApplication(Application application);

}
