package com.marcus.demo_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);
        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText etName = (EditText) findViewById(R.id.editTextName);
                EditText etAge = (EditText) findViewById(R.id.editTextAge);
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                Intent i = new Intent(DemoActivities.this, DemoActivities2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
