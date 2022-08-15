package com.hfad.appbasketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final int POINTS_FOR_FREE_THROW = 3;
    final int POINTS_FOR_TWO_THROW = 2;
    final int POINTS_FOR_ONE_THROW = 1;
    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;


    public void display(int score, String team) {
        TextView scoreView;
        if (team.equals("One")) {
            scoreView = findViewById(R.id.tvScoreTeamOne);
            scoreView.setText(String.valueOf(score));
        } else if (team.equals("Two")) {
            scoreView = findViewById(R.id.tvScoreTeamTwo);
            scoreView.setText(String.valueOf(score));
        }
    }


    public void addScore(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnTreePointsTeamOne:
                scoreTeamOne += POINTS_FOR_FREE_THROW;
                display(scoreTeamOne, "One");
                break;
            case R.id.btnTreePointsTeamTwo:
                scoreTeamTwo += POINTS_FOR_FREE_THROW;
                display(scoreTeamTwo, "Two");
                break;
            case R.id.btnTwoPointsTeamOne:
                scoreTeamOne += POINTS_FOR_TWO_THROW;
                display(scoreTeamOne, "One");
                break;
            case R.id.btnTwoPointsTeamTwo:
                scoreTeamTwo += POINTS_FOR_TWO_THROW;
                display(scoreTeamTwo, "Two");
                break;
            case R.id.btnFreeThrowTeamOne:
                scoreTeamOne += POINTS_FOR_ONE_THROW;
                display(scoreTeamOne, "One");
                break;
            case R.id.btnFreeThrowTeamTwo:
                scoreTeamTwo += POINTS_FOR_ONE_THROW;
                display(scoreTeamTwo, "Two");
                break;
        }
    }

    public void resetScore(View v) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        display(scoreTeamOne, "One");
        display(scoreTeamTwo, "Two");
    }
}