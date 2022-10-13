package com.kadriyeg.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.kadriyeg.quicklauncher.SOMETHING")){
            TextView textView= (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.kadriyeg.quicklauncher.SOMETHING");
            textView.setText(text);
        }
    }
}