package com.example.myapplication.model;

public class User {
    private String login;
    private int id;
    private String avatar_url;

    public User(String login, int id, String avatar_url) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
