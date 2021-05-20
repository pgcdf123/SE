import controller.UserController;
import controller.impl.UserControllerImpl;
import dao.impl.RecruitmentListMapperImpl;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.User;
import utils.FileLoader;
import utils.JsonData;

import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        JsonData.GetClassDirector().get(2).setSubject("sssssssssssssssssssss");
        RecruitmentListMapperImpl is=new RecruitmentListMapperImpl();
        is.uploadRecruitmentList(JsonData.GetClassDirector().get(2));
        is.downloadAll();
    }
}
