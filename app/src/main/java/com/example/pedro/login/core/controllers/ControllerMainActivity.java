package com.example.pedro.login.core.controllers;

/**
 * Created by pedro on 23/08/16.
 */
public class ControllerMainActivity {
    private static ControllerMainActivity instance = null;

    private String login;

    private ControllerMainActivity(){}

    public static ControllerMainActivity getInstance(){
        if (instance == null){
            instance = new ControllerMainActivity();
        }
        return instance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
