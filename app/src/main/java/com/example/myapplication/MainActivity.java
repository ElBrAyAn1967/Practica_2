package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override//proteccion de la informacion
    protected void onCreate(Bundle savedInstanceState) {//creacion de la funcion
        super.onCreate(savedInstanceState);//objeto que esta llamando al argumento .onCreate
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate ", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart ", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume() {
             super.onResume();
        Toast.makeText(this, "onResume ", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop() {
       super.onStop();
        Toast.makeText(this, "onStop ", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart ", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy ", Toast.LENGTH_SHORT).show();
    }

}