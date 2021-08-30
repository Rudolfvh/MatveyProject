package bel.matvey.theme.conditional.Task_05.Service;

import bel.matvey.theme.conditional.Task_05.entity.User;

public class UserLoginService {

    private int attempts,userAttempts;
    private String userServicePassword;
    private boolean block = true;

    public boolean login(User user, String userPassword){
        setUserServicePassword(userPassword);
        if(user.getPassword() == userServicePassword && user.getBlockUser()){
            setNumberOfAttempts(0);
            return true;
        }
        else if(getNumberOfAttempts() == 3){
            user.setUserBlock(false);
        }
        userAttempts++;
        setNumberOfAttempts(userAttempts);
        return false;
    }

    private void setUserServicePassword(String userPassword) {userServicePassword = userPassword;}
    public String getUserServicePassword(){return userServicePassword;}

    public void setNumberOfAttempts(int numberOfAttempts) {
        attempts = numberOfAttempts;
    }
    public int getNumberOfAttempts() {return attempts;}
}
