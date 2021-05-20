import controller.UserController;
import controller.impl.UserControllerImpl;
import entity.RecruitmentList;
import entity.TrainingList;
import entity.User;
import utils.FileLoader;
import utils.JsonData;

import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        List<TrainingList> users=JsonData.GetCandidateTeacher();
        for(TrainingList list:users)
        {
            System.out.println(list.getGUID());
        }
    }
}
