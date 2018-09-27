package com.example.jaielalondon.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds 6 points to team A's score
     */
    public void touchdownTeamA(View view) {
        teamAScore = teamAScore + 6;
        displayForTeamA(teamAScore);
    }

    /**
     * adds 1 point to team A's score
     */
    public void extraPointTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * adds 2 points to team A's score
     */
    public void twoPointsTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * adds 3 points to team A's score
     */
    public void fieldGoalTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    /**
     * adds 2 points to team A's score
     */
    public void safetyTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 6 points to team B's score
     */
    public void touchdownTeamB(View view) {
        teamBScore = teamBScore + 6;
        displayForTeamB(teamBScore);
    }

    /**
     * adds 1 point to team B's score
     */
    public void extraPointTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    /**
     * adds 2 points to team B's score
     */
    public void twoPointsTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    /**
     * adds 3 points to team B's score
     */
    public void fieldGoalTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    /**
     * adds 2 points to team A's score
     */
    public void safetyTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets both teams scores to 0
     */
    public void resetGame(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
