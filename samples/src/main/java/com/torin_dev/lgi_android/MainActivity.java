package com.torin_dev.lgi_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.torindev.lgi_android.Lgi;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lgi.p();
        Lgi.p(11);
        Lgi.p("hello");
        String name = Lgi.getName(this);
        Lgi.p("name: " + name);
    }
}
