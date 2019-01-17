package com.jicketyjackindustries.dicesimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.textViewResField);
    }

    public void setResultField(int res, String typeOfDice){
        String s = Integer.toString(res);
        t.setText(typeOfDice + " :  "+ s);
    }

    public void onD4Roll(View v){
        int res = getRandomBetween(1,4);
        setResultField(res,"D4");
    }

    public void onD6Roll(View v){
        int res = getRandomBetween(1,6);
        setResultField(res,"D6");
    }

    public void onD8Roll(View v){
        int res = getRandomBetween(1,8);
        setResultField(res,"D8");
    }
    public void onD10Roll(View v){
        int res = getRandomBetween(1,10);
        setResultField(res,"D10");
    }

    public void onD12Roll(View v){
        int res = getRandomBetween(1,12);
        setResultField(res,"D12");
    }

    public void onD20Roll(View v){
        int res = getRandomBetween(1,20);
        setResultField(res,"D20");
    }

    public int getRandomBetween(int minOffset, int max){
        Random rand = new Random();
        int res = rand.nextInt(max) + minOffset;
        return res;
    }
  /* SAVING THIS CODE FOR REFERENCE LATER!! WE'RE STILL NEW TO ANDROID
    public void onD6Roll(View v){
        int res = getRandomBetween(1,6);
        String message = Integer.toString(res);
        Toast myToast = Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG);
        myToast.show();
    }*/
}
