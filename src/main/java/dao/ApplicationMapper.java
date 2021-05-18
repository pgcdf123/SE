package dao;

import entity.Application;

public interface ApplicationMapper {

    Application findApplicationByGUID(String GUID);

    void submitApplication(Application application);

}
