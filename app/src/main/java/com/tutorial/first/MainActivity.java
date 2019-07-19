package com.tutorial.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button goNoTitleBtn, goFirstBtn, goSumBtn, goToggleButtonsBtn, goCheckBoxBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goNoTitleBtn = (Button) findViewById(R.id.goNoTitleBtn);
        goFirstBtn = (Button) findViewById(R.id.goFirstBtn);
        goSumBtn = (Button) findViewById(R.id.goSumBtn);
        goToggleButtonsBtn = (Button) findViewById(R.id.goToggleButtonsBtn);
        goCheckBoxBtn = (Button) findViewById(R.id.goCheckBoxBtn);

        // Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        // Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        // Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout); // Setting the view of custom toast layout
        toast.show();
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

    public void goToggleButtons(View v) {
        Intent intent = new Intent(MainActivity.this, ToggleButtonsActivity.class);
        startActivity(intent);
    }

    public void goCheckBox(View v) {
        Intent intent = new Intent(MainActivity.this, CheckboxActivity.class);
        startActivity(intent);
    }

}
