package bel.matvey.theme.conditional.Task_05;
import bel.matvey.theme.conditional.Task_05.entity.User;
import bel.matvey.theme.conditional.Task_05.entity.UserLoginService;
import bel.matvey.theme.conditional.Task_05.entity.UserLoginServiceTest;
import bel.matvey.theme.conditional.Task_05.entity.UserTest;

public class UserLoginServiceDemo {
    public static void main(String[] args) {

        UserLoginServiceTest serviceTest = new UserLoginServiceTest();
        UserTest userTestOne = new UserTest("userTest-login", "userTest-password-1111");
        System.out.println(serviceTest.loginTest(userTestOne,"userTest-password-1112"));
        System.out.println(serviceTest.loginTest(userTestOne,"userTest-password-1112"));
        System.out.println(serviceTest.loginTest(userTestOne,"userTest-password-1122"));
        System.out.println(serviceTest.loginTest(userTestOne,"userTest-password-1111"));

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login","user-password");
        System.out.println(service.login(userOne,"user-password-13547"));

    }
}
