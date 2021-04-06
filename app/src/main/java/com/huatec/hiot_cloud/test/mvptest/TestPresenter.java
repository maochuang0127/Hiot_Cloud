package com.huatec.hiot_cloud.test.mvptest;

import android.widget.TextView;

import com.huatec.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {
    private TestView view;
    public TestPresenter(TestView view) {
        this.view = view;
    }
    public void login(User user){
        if("xiangliyue".equals(user.getUserName()) && "1803080102".equals(user.getPassword())){
            view.showMassage("登录成功");
        }else {
            view.showMassage("登录失败");
        }
    }
        }


