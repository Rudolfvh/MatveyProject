package bel.matvey.theme.conditional.Task_05.entity;

public class UserLoginService {
    public boolean login(User user, String password){
        if(user.password  == password && user.block == true){
            user.resetAttempts();
            return true;
        } else if(user.block == true){
            user.numberOfAttempts++;
            if(user.numberOfAttempts == 3)user.blockUser();
        }

        return false;
    }
}
