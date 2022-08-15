package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView vasya = findViewById(R.id.tvMa);
        Button bt1 = findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                vasya.setText("Hello Vasya!");
            }
        });

    }
}