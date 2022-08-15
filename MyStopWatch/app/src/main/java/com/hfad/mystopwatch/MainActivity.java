package com.hfad.mystopwatch;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new StopWatchFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.stopwatchFragment:
                        selectedFragment = new StopWatchFragment();
                        break;
                    case R.id.weatherFragment:
                        selectedFragment = new WeatherFragment();
                        break;
                    case R.id.timerFragment:
                        selectedFragment = new TimerFragment();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, selectedFragment).commit();

                return true;
            };
}

