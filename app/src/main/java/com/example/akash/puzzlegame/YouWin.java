package com.example.akash.puzzlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class YouWin extends AppCompatActivity {

    int lebel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_win);

        TextView level1 = (TextView) findViewById(R.id.message);
        TextView score1 = (TextView) findViewById(R.id.scoreMessage);
        TextView win = (TextView) findViewById(R.id.win);
        TextView button = (TextView) findViewById(R.id.level_button);

        String level = getIntent().getExtras().getString("level");
        String score = getIntent().getExtras().getString("score");
        lebel = Integer.parseInt(getIntent().getExtras().getString("lebel").toString());

        if(lebel==5){
            level1.setText("");
            score1.setText("");
            button.setVisibility(View.INVISIBLE);
            win.setText("আপনি জিতেছেন!");
        } else {
            level1.setText(level);
            score1.setText(score);
        }
    }

    public void next(View v) {
        if (lebel==1) {
            Intent intent = new Intent(YouWin.this, Level_2.class);
            startActivity(intent);
        } else if(lebel == 2) {
            Intent intent = new Intent(YouWin.this, Level_3.class);
            startActivity(intent);
        } else if(lebel == 3) {
            Intent intent = new Intent(YouWin.this, Level_4.class);
            startActivity(intent);
        } else if(lebel == 4) {
            Intent intent = new Intent(YouWin.this, Level_5.class);
            startActivity(intent);
        }
    }
}
