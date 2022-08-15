package com.example.trafficlight;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private LinearLayout b1, b2, b3;
    private Button button1;
    private boolean start_stop = false;
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.bulb_1);
        b2 = findViewById(R.id.bulb_2);
        b3 = findViewById(R.id.buld_3);
        button1 = findViewById(R.id.button1);
    }

    public void onClickStart(View view) {
        if (!start_stop) {
            button1.setText("Stop");
            start_stop = true;


            Runnable viva = new Runnable() {
                @Override
                public void run() {
                    while (start_stop) {
                        counter++;
                        switch (counter){
                            case 1:
                                b1.setBackgroundColor(getResources().getColor(R.color.purple_200));
                                b2.setBackgroundColor(getResources().getColor(R.color.white));
                                b3.setBackgroundColor(getResources().getColor(R.color.white));
                                break;
                            case 2:
                                b1.setBackgroundColor(getResources().getColor(R.color.white));
                                b2.setBackgroundColor(getResources().getColor(R.color.purple_700));
                                b3.setBackgroundColor(getResources().getColor(R.color.white));
                                break;
                            case 3:
                                b1.setBackgroundColor(getResources().getColor(R.color.white));
                                b2.setBackgroundColor(getResources().getColor(R.color.white));
                                b3.setBackgroundColor(getResources().getColor(R.color.purple_500));
                                counter = 0;
                                break;
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            new Thread(viva).start();
//            new Thread(() -> {
//
//
//                while (start_stop) {
//                    counter++;
//                    switch (counter){
//                        case 1:
//                            b1.setBackgroundColor(getResources().getColor(R.color.purple_200));
//                            b2.setBackgroundColor(getResources().getColor(R.color.white));
//                            b3.setBackgroundColor(getResources().getColor(R.color.white));
//                            break;
//                        case 2:
//                            b1.setBackgroundColor(getResources().getColor(R.color.white));
//                            b2.setBackgroundColor(getResources().getColor(R.color.purple_700));
//                            b3.setBackgroundColor(getResources().getColor(R.color.white));
//                            break;
//                        case 3:
//                            b1.setBackgroundColor(getResources().getColor(R.color.white));
//                            b2.setBackgroundColor(getResources().getColor(R.color.white));
//                            b3.setBackgroundColor(getResources().getColor(R.color.purple_500));
//                            counter = 0;
//                            break;
//                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }).start();
        } else
            {
            start_stop = false;
            button1.setText("Start");

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        start_stop = false;
    }
}
