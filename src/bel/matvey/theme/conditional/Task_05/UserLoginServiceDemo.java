package bel.matvey.theme.conditional.Task_05;
import bel.matvey.theme.conditional.Task_05.entity.User;
import bel.matvey.theme.conditional.Task_05.Service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userOne = new User("max", "123");
        System.out.println(service.login(userOne, "123"));
    }
}
