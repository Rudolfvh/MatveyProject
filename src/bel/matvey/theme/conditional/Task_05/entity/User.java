package bel.matvey.theme.conditional.Task_05.entity;

public class User {
    private String login,password;
    private int numberOfAttempts;
    private boolean userBlock = true;

    public User(String userLogin, String userPassword) {
        setLogin(userLogin);
        setPassword(userPassword);
    }


    public void setLogin(String userLoginService) {login = userLoginService;}
    public void setPassword(String userPasswordService) {password = userPasswordService;}

    public String getLogin(){return login;}
    public String getPassword(){return password;}

    public boolean getBlockUser(){return userBlock;}
    public void setUserBlock(boolean block){userBlock = block;}
}
