package com.tutorial.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.tutorial.first.R;

public class VisitWebActivity extends AppCompatActivity {

    private Button visitButton;
    private EditText urlText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_web);

        visitButton = findViewById(R.id.visitButton);
        urlText = findViewById(R.id.urlText);

        visitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String url = urlText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
