package com.tutorial.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tutorial.first.R;
import com.tutorial.first.SecondActivity;

public class CallActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activities);
    }

    public void callSecondActivity(View view) {
        Intent i = new Intent(getApplication(), CallActivitiesTwoActivity.class);
        i.putExtra("Value1", "Android By Japatpoint");
        i.putExtra("Value2", "Simple Tutorial");
        startActivity(i);
    }
}
