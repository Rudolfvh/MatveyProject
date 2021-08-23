package bel.matvey.theme.conditional.Task_05.entity;

public class UserTest {
    public String loginTest, passwordTest;
    public int numberOfAttemptsTest;
    public boolean blockTest = true;

    public UserTest(String userLoginTest, String userPasswordTest) {
        this.loginTest = userLoginTest;
        this.passwordTest = userPasswordTest;
    }

    public void resetAttemptsTest(){
        this.numberOfAttemptsTest = 0;
    }

    public void blockUserTest(){
        this.blockTest = false;
    }
}
