package bel.matvey.theme.conditional.Task_05.entity;

public class User {
    private String userLoginService,userPasswordService;
    private int numberOfAttempts;
    private boolean userBlock = true;

    public User(String userLogin, String userPassword) {
        setLogin(userLogin);
        setPassword(userPassword);
    }


    public void setLogin(String login) {userLoginService = login;}
    public void setPassword(String password) {userPasswordService = password;}

    public String getLogin(){return userLoginService;}
    public String getPassword(){return userPasswordService;}

    public boolean getBlockUser(){return userBlock;}
    public void setUserBlock(boolean block){userBlock = block;}
}
