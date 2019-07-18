package com.tutorial.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button goNoTitleBtn;
    Button goFirstBtn;
    Button goSumBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goNoTitleBtn = (Button) findViewById(R.id.goNoTitleBtn);
        goFirstBtn = (Button) findViewById(R.id.goFirstBtn);
        goSumBtn = (Button) findViewById(R.id.goSumBtn);
    }

    public void goNoTitle(View v) {
        Intent intent = new Intent(MainActivity.this, NoTitleActivity.class);
        startActivity(intent);
    }

    public void goFirst(View v) {
        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
        startActivity(intent);
    }

    public void goSum(View v) {
        Intent intent = new Intent(MainActivity.this, SumTwoNumberActivity.class);
        startActivity(intent);
    }

}
