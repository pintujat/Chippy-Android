package com.example.tappyspaceship01;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayerWon extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_won);
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);


    }



    public void startAgain(View view)
    {
        Intent intent  = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }
}
