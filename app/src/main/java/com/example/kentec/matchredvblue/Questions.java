package com.example.kentec.matchredvblue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }
    int player1Score = 0;
    int question1 = 0;
    int question2 = 0;
    int question3 = 0;
    int question4 = 0;
    int question5 = 0;
    int player2Score = 0;
    int question6 = 0;
    int question7 = 0;
    int question8 = 0;
    int question9 = 0;
    int question10 = 0;

    public void buttonQ1_A (View view){
        int question1 = 1;
    }
    public void buttonQ1_B (View view){
        int question1 = -1;
    }
    public void buttonQ2_A (View view){
        int question2 = 1;
    }
    public void buttonQ2_B (View view){
        int question2 = -1;
    }
    public void buttonQ3_A (View view){
        int question3 = 1;
    }
    public void buttonQ3_B (View view){
        int question3 = -1;
    }
    public void buttonQ4_A (View view){
        int question4 = 1;
    }
    public void buttonQ4_B (View view){
        int question4 = -1;
    }
    public void buttonQ5_A (View view){
        int question5 = 1;
    }
    public void buttonQ5_B (View view){
        int question5 = -1;
    }

    //now for player 2
    public void buttonQ1_A2 (View view){
        int question6 = 1;
    }
    public void buttonQ1_B2 (View view){
        int question6 = -1;
    }
    public void buttonQ2_A2 (View view){
        int question7 = 1;
    }
    public void buttonQ2_B2 (View view){
        int question7 = -1;
    }
    public void buttonQ3_A2 (View view){
        int question8 = 1;
    }
    public void buttonQ3_B2 (View view){
        int question8 = -1;
    }
    public void buttonQ4_A2 (View view){
        int question9 = 1;
    }
    public void buttonQ4_B2 (View view){
        int question9 = -1;
    }
    public void buttonQ5_A2 (View view){
        int question10 = 1;
    }
    public void buttonQ5_B2 (View view){
        int question10 = -1;
    }


    public void startResults (View view){

        player1Score = question1 + question2 + question3 + question4 + question5;
        player2Score = question6 + question7 + question8 + question9 + question10;

        Intent intent = new Intent(this, Results.class);
        intent.putExtra("player1Score", player1Score);
        intent.putExtra("player2Score", player2Score);
        startActivity(intent);
    }

}