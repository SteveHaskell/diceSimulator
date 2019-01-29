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

    public void onRoll(int typeOfDice){
        String diceName;
        if(typeOfDice==4){
            diceName = "D4";
        }
        else if(typeOfDice==6){
            diceName = "D6";
        }
        else if(typeOfDice==8){
            diceName = "D8";
        }
        else if(typeOfDice==10){
            diceName = "D10";
        }
        else if(typeOfDice==12){
            diceName = "D12";
        }
        else if(typeOfDice==20){
            diceName = "D20";
        }
        else {
            diceName = "N/A";
        }
        int res = getRandomBetween(1,typeOfDice);

        setResultField(res,diceName);
    }
    public void onD4Roll(View v){
        onRoll(4);
    }

    public void onD6Roll(View v){
        onRoll(6);
    }

    public void onD8Roll(View v){
        onRoll(8);
    }
    public void onD10Roll(View v){
        onRoll(10);
    }

    public void onD12Roll(View v){
        onRoll(12);
    }

    public void onD20Roll(View v){
        onRoll(20);
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
