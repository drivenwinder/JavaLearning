package com.wondfo.test;

public class User {

    private  String UserName;
    private  String Pwd;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User(String userName, String pwd) {
        UserName = userName;
        Pwd = pwd;
    }

    public String getUserName() {
        
        return UserName;

    }

    public String getPwd() {
        return Pwd;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}
