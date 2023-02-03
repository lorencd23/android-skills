package com.example.skill4parte6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "Valor Información");
        Log.i("Debug", "Valor Debug");
        Log.i("Warning", "Valor Warning");
        Log.i("Error", "Valor Error");
        Log.i("Verbose", "Valor Verbose");

        Log.i(TAG, "Mensaje seguimiento 1");
        Log.i(TAG, "Mensaje seguimiento 2");
        Log.i(TAG, "Mensaje seguimiento 3");
        Log.i(TAG, "Mensaje seguimiento 4");
        Log.i(TAG, "Mensaje seguimiento 5");


    }
}