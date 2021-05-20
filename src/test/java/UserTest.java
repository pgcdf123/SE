import controller.UserController;
import controller.impl.UserControllerImpl;
import dao.UserMapper;
import dao.impl.RecruitmentListMapperImpl;
import dao.impl.UserMapperImpl;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.User;
import entity.userimpl.ClassDirector;
import utils.FileLoader;
import utils.JsonData;

import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        UserMapper user=new UserMapperImpl();
        User us=new ClassDirector();
        us.setPassword("7878");
        us.setGUID("0058");
        us.setId(1);
        user.addUser(us);
        JsonData.commit();
    }
}
