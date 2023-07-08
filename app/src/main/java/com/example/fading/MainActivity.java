package com.example.fading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fading(View view){
        ImageView zenitsu = (ImageView)findViewById(R.id.zenitsu);
        //ImageView levi = (ImageView)findViewById(R.id.levi);

        zenitsu.animate().translationXBy(2000).setDuration(3000);
        //levi.animate().alpha(1).setDuration(3000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView zenitsu = (ImageView)findViewById(R.id.zenitsu);
        zenitsu.setTranslationX(-2000);
    }
}