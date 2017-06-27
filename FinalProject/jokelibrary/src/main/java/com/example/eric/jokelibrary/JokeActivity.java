package com.example.eric.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        ProgressBar spinner;
        spinner = (ProgressBar) findViewById(R.id.progressBar1);
        spinner.setVisibility(View.VISIBLE);


        Intent jokeIntent = getIntent();

        if (jokeIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String jokeText = jokeIntent.getStringExtra(Intent.EXTRA_TEXT);

            TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);
            jokeTextView.setText(jokeText);
            spinner.setVisibility(View.GONE);
        }

    }

}
