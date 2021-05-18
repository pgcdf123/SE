package dao.impl;

import dao.UserMapper;
import entity.User;
import utils.JsonData;

public class UserMapperImpl implements UserMapper {
    @Override
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

    @Override
    public User findByGUID(String GUID) {
        User userInformation=null;
        for(User eachuser : JsonData.GetUserAccount())
        {
            if(GUID.equals(eachuser.getGUID()))
            {
                userInformation=eachuser;
                break;
            }
        }
        return  userInformation;
    }
}
