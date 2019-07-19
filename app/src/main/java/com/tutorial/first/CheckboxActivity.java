package com.tutorial.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckboxActivity extends AppCompatActivity {

    CheckBox pizza, coffee, burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        pizza = (CheckBox) findViewById(R.id.checkBoxPizza);
        coffee = (CheckBox) findViewById(R.id.checkBoxCoffee);
        burger = (CheckBox) findViewById(R.id.checkBoxBurger);
        buttonOrder = (Button) findViewById(R.id.checkBoxSubmit);

        buttonOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items: ");
                if (pizza.isChecked()) {
                    result.append("\nPizza $12");
                    totalAmount += 12;
                }
                if (coffee.isChecked()) {
                    result.append("\nCoffe $4");
                    totalAmount += 4;
                }
                if (burger.isChecked()) {
                    result.append("\nBurguer $8");
                    totalAmount += 8;
                }
                result.append("\nTotal: $" + totalAmount);
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
