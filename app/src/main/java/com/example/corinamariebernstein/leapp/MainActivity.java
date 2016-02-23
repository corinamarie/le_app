package com.example.corinamariebernstein.leapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //setting default score display
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "you are the greatest!!", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //TEAM A METHODS
    //threePts score display

    public void threePtsA (View view){
        totalScoreA += 3;
        displayForTeamA(totalScoreA);
    }

    //twoPts score display

    public void twoPtsA (View view){
        totalScoreA += 2;
        displayForTeamA(totalScoreA);
    }

    //freeThrow score display

    public void freeThrowA (View view){
        totalScoreA += 1;
        displayForTeamA(totalScoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //TEAM B METHODS
    //threePts score display

    public void threePtsB (View view){
        totalScoreB += 3;
        displayForTeamB(totalScoreB);
    }

    //twoPts score display

    public void twoPtsB (View view){
        totalScoreB += 2;
        displayForTeamB(totalScoreB);
    }

    //freeThrow score display

    public void freeThrowB (View view){
        totalScoreB += 1;
        displayForTeamB(totalScoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void clearScore(){
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
    }
}
