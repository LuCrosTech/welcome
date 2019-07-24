package com.tutorial.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tutorial.first.FirstActivity;
import com.tutorial.first.R;

public class CallActivitiesTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_activities_two);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();
    }

    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(), CallActivitiesActivity.class);
        startActivity(i);
    }
}
