package com.hfad.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");
        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/desert", null, this.getPackageName());
        firstImage.setImageResource(imageResource);
    }
}