package com.hfad.textview;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R. id.textView1);
        textView.setText("It's easy for me!");

        String stringFromTextView = textView.getText().toString();
        System.out.println(stringFromTextView);
        Log.d(TAG, "onCreate: " + stringFromTextView);
    }
}