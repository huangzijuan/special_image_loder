package com.example.huangzijuan.imageloader.ui.base;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected <T> T findView(int id) {
        return (T) findViewById(id);
    }
}
