package com.atguigu.myandroidgittest222;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("版本1.0");
        System.out.println("升级版本1.5");
        System.out.println("需要添加新功能了");
    }
}
