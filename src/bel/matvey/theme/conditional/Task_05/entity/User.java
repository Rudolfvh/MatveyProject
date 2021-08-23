package bel.matvey.theme.conditional.Task_05.entity;

public class User {
    public String login, password;
    public int numberOfAttempts;
    public boolean block = true;

    public User(String userLogin, String userPassword) {
        this.login = userLogin;
        this.password = userPassword;
    }

    public void resetAttempts(){
    this.numberOfAttempts = 0;
    }

    public void blockUser(){
        this.block = false;
    }
}
