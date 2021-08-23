package bel.matvey.theme.conditional.Task_05.entity;

public class UserLoginServiceTest {
    public boolean loginTest(UserTest userTest,String passwordTest){
        if(userTest.passwordTest  == passwordTest && userTest.blockTest == true){
            userTest.resetAttemptsTest();
            return true;
        } else if(userTest.blockTest == true){
            userTest.numberOfAttemptsTest++;
            if(userTest.numberOfAttemptsTest == 3)userTest.blockUserTest();
        }

        return false;

    }
}
