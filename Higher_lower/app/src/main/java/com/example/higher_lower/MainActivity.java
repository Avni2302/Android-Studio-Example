package com.example.higher_lower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void guessTheNumber(View view){

        EditText editText= (EditText) findViewById(R.id.editTextNumber);
        int guessInt= Integer.parseInt(editText.getText().toString());
        if(guessInt > randomnumber)
            Toast.makeText(MainActivity.this, "lower", Toast.LENGTH_SHORT).show();
        else if(guessInt<randomnumber)
            Toast.makeText(MainActivity.this, "higher", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
            Random rn = new Random();
            randomnumber= rn.nextInt(20) + 1;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random rn = new Random();
        randomnumber= rn.nextInt(20) + 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}