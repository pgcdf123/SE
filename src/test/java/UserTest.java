import controller.UserController;
import controller.impl.UserControllerImpl;
import utils.JsonData;

public class UserTest {
    public static void main(String[] args) {

        UserController controller = new UserControllerImpl();
        controller.register(1,"123","123456");
        controller.login("123","123456");
    }
}
