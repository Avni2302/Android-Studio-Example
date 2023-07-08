package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText username = (EditText) findViewById(R.id.EditText2);
        Log.i("Info", username.getText().toString());
        EditText password=(EditText) findViewById((R.id.editTextPassword));
        Log.i("Info",password.getText().toString());
        Toast.makeText(MainActivity.this, username.getText().toString(), Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}