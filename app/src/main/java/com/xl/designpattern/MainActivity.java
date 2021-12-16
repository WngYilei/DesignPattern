package com.xl.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xl.designpattern.chain.Director;
import com.xl.designpattern.chain.GroupLeader;
import com.xl.designpattern.chain.Leader;
import com.xl.designpattern.chain.Manager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        groupLeader.setNextLeader(director);
        director.setNextLeader(manager);
    }
}