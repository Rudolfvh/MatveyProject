package bel.matvey.theme.conditional.Task_05.Test;

import bel.matvey.theme.conditional.Task_05.Service.UserLoginService;
import bel.matvey.theme.conditional.Task_05.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void succesPassword() {
        User user = new User("max","12354");
        UserLoginService service = new UserLoginService();
        service.login(user,"12354");
        assertEquals(user.getPassword(),service.getUserServicePassword());
    }

    @Test
    public void failedPassword() {
        User user = new User("max","12352");
        UserLoginService service = new UserLoginService();
        service.login(user,"12354");
        assertEquals(user.getPassword(),service.getUserServicePassword());
    }
}