package com.example.ejemploconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This o getApplicationContext() es lo mismo, pero con la segunda es mejor
        // por si usamos eventos fuera de esta clase, ya que con this se usan claves anónimas
        Toast.makeText(getApplicationContext(), "Hola, esto es un Toast", Toast.LENGTH_LONG).show();

    }
}