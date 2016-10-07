package com.example.administrator.myapplication;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Mapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
