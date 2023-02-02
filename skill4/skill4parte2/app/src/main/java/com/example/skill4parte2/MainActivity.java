package com.example.skill4parte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = (CheckBox) findViewById(R.id.idCheck1);
        c2 = (CheckBox) findViewById(R.id.idCheck2);

    }

    public void onclick(View view) {
        if(view.getId() == R.id.btn1){
            validar();
        }
    }

    private void validar() {
        String cad = "Seleccionado:  \n";

        if(c1.isChecked()){
            cad+="Opcion1";
        }

        if(c2.isChecked()){
            cad+="Opcion2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();

    }

}