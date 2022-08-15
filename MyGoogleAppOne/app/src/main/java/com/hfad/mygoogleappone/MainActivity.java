package com.hfad.mygoogleappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPlus;
    Button btnMinus;
    Button btnResult;
    TextView tvNumberOfPieces;
    TextView tvPriceOfPieces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnResult = findViewById(R.id.btnResult);
        tvNumberOfPieces = findViewById(R.id.tvNumberOfPieces);
        tvPriceOfPieces = findViewById(R.id.tvPriceOfPieces);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}