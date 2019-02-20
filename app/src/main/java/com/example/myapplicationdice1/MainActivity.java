package com.example.myapplicationdice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2;
        button2=(Button) findViewById(R.id.button2);
        final ImageView dice1=(ImageView)findViewById(R.id.dice1);
        final ImageView dice3=(ImageView)findViewById(R.id.dice3);
        final int[] dicearray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
//test comment
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyApplicationDice1","clicked hello");
                Random randnum=new Random();
                int num=randnum.nextInt(6);
                Log.d("MyApplicationDice1", "onClick: random number is"+num);
                dice1.setImageResource(dicearray[num]);
                num=randnum.nextInt(6);
                dice3.setImageResource(dicearray[num]);


            }
        });
    }
}
