package com.tutorial.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SumTwoNumberActivity extends AppCompatActivity {

    private EditText editTextSum1, editTextSum2;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_two_number);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        editTextSum1 = (EditText) findViewById(R.id.editTextSum1);
        editTextSum2 = (EditText) findViewById(R.id.editTextSum2);
        buttonSum = (Button) findViewById(R.id.buttonSum);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = editTextSum1.getText().toString();
                String value2 = editTextSum2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a + b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }

}
