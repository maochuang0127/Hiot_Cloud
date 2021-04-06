package com.huatec.hiot_cloud.test.mvptest.model;

import java.io.Serializable;

public class User implements Serializable {
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private String userName;
    private String password;

}
