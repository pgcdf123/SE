package dao.impl;

import dao.UserMapper;
import entity.User;
import entity.userimpl.ClassDirector;
import utils.JsonData;

public class UserMapperImpl implements UserMapper {
    public boolean addUser(User user) {
        try
        {
            JsonData.GetUserAccount().add(user);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }
    public User findByGUID(String GUID) {
        User userInformation=null;
        userInformation=JsonData.findByID(GUID);
        return  userInformation;
    }
}
