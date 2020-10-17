package com.rauln.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rauln.lab3.lifecycle.ActivityA;
import com.rauln.lab3.lifecycle.ActivityB;
import com.rauln.lab3.lifecycle.ActivityC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        switch(view.getId()){
            case R.id.buttonA:{
                startActivity(new Intent(this, ActivityA.class));
            }
            case R.id.buttonB:{
                startActivity(new Intent(this, ActivityB.class));
            }
            case R.id.buttonC:{
                startActivity(new Intent(this, ActivityC.class));
            }
        }
    }
}