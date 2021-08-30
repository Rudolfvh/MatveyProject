package bel.matvey.theme.conditional.Task_05.Test;

import bel.matvey.theme.conditional.Task_05.Service.UserLoginService;
import bel.matvey.theme.conditional.Task_05.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void userBlock() {
        User user = new User("max","12352");
        UserLoginService service = new UserLoginService();
        service.login(user,"12354");
        service.login(user,"12354");
        service.login(user,"12354");
        service.login(user,"12354");
        assertEquals(false,user.getBlockUser());
    }

    @Test
    public void nonUserBlock(){
        User user = new User("max","12352");
        UserLoginService service = new UserLoginService();
        service.login(user,"12354");
        service.login(user,"12354");
        service.login(user,"12352");
        service.login(user,"12354");
        assertEquals(true,user.getBlockUser());
    }
}