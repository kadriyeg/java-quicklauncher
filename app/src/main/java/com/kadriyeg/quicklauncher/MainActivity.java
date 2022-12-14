package com.kadriyeg.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.kadriyeg.quicklauncher.SOMETHING", "Hello World!");
                startActivity(startIntent);
            }
        });

        //attempt to launch an activity outside my app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String google="http://www.google.com";
                Uri webadress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webadress);
                if(gotoGoogle.resolveActivity(getPackageManager())!=null){
                startActivity(gotoGoogle);
            }
    }
}
);
    }
}