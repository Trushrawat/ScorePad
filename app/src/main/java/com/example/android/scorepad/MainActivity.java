package com.example.android.scorepad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a2(View view) {
        scoreA = scoreA + 2;
        DisplayA(scoreA);
    }

    public void a3(View view) {
        scoreA = scoreA + 3;
        DisplayA(scoreA);
    }

    public void b2(View view) {
        scoreB = scoreB + 2;
        DisplayB(scoreB);
    }

    public void b3(View view) {
        scoreB = scoreB + 3;
        DisplayB(scoreB);
    }

    public void aft(View view) {
        scoreA = scoreA + 1;
        DisplayA(scoreA);
    }

    public void bft(View view) {
        scoreB = scoreB + 1;
        DisplayB(scoreB);
    }



    private void DisplayA(int number) {
        TextView scoreBoardA = (TextView) findViewById(R.id.score_team_a);
        scoreBoardA.setText( "" + number );
    }

    private void DisplayB(int number) {
        TextView scoreBoardB = (TextView) findViewById(R.id.score_team_b);
        scoreBoardB.setText("" +  number);
    }


}
