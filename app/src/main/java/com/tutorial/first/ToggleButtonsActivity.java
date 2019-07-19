package com.tutorial.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonsActivity extends AppCompatActivity {

    private ToggleButton toggleButton1, toggleButton2;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_buttons);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        // Getting the ToggleButton and Button instance from the layout xml file
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        buttonSubmit = (Button) findViewById(R.id.submitButton);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1: ").append(toggleButton1.getText());
                result.append("\nToggleButton2: ").append(toggleButton2.getText());
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
