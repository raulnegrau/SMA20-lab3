package com.rauln.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rauln.lab3.lifecycle.ActivityA;
import com.rauln.lab3.lifecycle.ActivityB;
import com.rauln.lab3.lifecycle.ActivityC;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate MainActivity");
    }

    public void clicked(View view){
        switch(view.getId()){
            case R.id.buttonA:{
                startActivity(new Intent(getApplicationContext(), ActivityA.class));
                break;
            }
            case R.id.buttonB:{
                startActivity(new Intent(this, ActivityB.class));
                break;
            }
            case R.id.buttonC:{
                startActivity(new Intent(this, ActivityC.class));
                break;
            }
        }
    }
}