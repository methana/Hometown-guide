package com.example.android.kedainiaitourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button visit = (Button) findViewById(R.id.visit);
    visit.setOnCliskListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {

        }
    });
    Button history = (Button) findViewById(R.id.history);
    history.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
    }
}
