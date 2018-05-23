package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.tvobjective);
        final ImageView ballDisplay=findViewById(R.id.image_eightball);
        Button mybutton=findViewById(R.id.askbutton);
        final int []ballarray=new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator=new Random();
                int number=randomNumberGenerator.nextInt(5);
                Log.d("8ball","The number is"+number);
                ballDisplay.setImageResource(ballarray[number]);
            }
        });
    }
}
