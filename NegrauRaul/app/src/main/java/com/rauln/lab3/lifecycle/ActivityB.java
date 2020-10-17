package com.rauln.lab3.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rauln.lab3.R;

public class ActivityB extends AppCompatActivity {

    private static final String TAG = "lifecycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("B");
        Log.d(TAG, "onCreate B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ActivityB.TAG, "onResume B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ActivityB.TAG, "onPause B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ActivityB.TAG, "onStart B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ActivityB.TAG, "onRestart B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ActivityB.TAG, "onStop B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ActivityB.TAG, "onDestroy B");
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
