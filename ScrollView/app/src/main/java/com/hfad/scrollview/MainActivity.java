package com.hfad.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTittleWindows = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindows = (TextView) findViewById(R.id.messageWindow);

        mTittleWindows.setText("This is some Title.");

        StringBuilder stringBuilder = new StringBuilder();

        String someMessage = " This is some message that I'm writtiing to appand. ";
        for (int i =0; i < 100; i++) {
            stringBuilder.append(someMessage);
        }

        mMessageWindows.setText(stringBuilder.toString());

    }
}