package bel.matvey.theme.conditional.Task_05.entity;

public class User {
    private String login,password;
    private int numberOfAttempts;
    private boolean userBlock = true;

    public User(String userLogin, String userPassword) {
        setLogin(userLogin);
        setPassword(userPassword);
    }


    public void setLogin(String login) {this.login = login;}
    public void setPassword(String password) {this.password = password;}

    public String getLogin(){return this.login;}
    public String getPassword(){return this.password;}

    public boolean getBlockUser(){return userBlock;}
    public void setUserBlock(boolean block){userBlock = block;}
}
