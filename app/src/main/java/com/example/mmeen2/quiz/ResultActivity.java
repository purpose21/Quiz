package com.example.mmeen2.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        textResult.setText("Your score is " + " " + score + ". Thanks for playing Quiz....");
    }

    public void playagain(View o) {
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }
}
