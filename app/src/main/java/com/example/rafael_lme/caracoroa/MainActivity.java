package com.example.rafael_lme.caracoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlayId);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                         Random rand = new Random();
                         int num = rand.nextInt(100) + 1;
                         CaraOuCoroa(num);
            }
        });



    }

    private void CaraOuCoroa(int num) {

        Intent intent;

        if(num % 2 == 0){
            intent = new Intent(this,CaraActivity.class);
        }
        else{
            intent = new Intent(this,CoroaActivity.class);
        }

        startActivity(intent);
    }
}
