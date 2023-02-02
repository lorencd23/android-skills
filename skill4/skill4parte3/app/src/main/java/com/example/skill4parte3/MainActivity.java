package com.example.skill4parte3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.skill4parte3.R;

public class MainActivity extends AppCompatActivity {

    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.idRadio1);
        r2 = (RadioButton) findViewById(R.id.idRadio2);

    }

    public void onclick(View view) {
        if(view.getId() == R.id.btn1){
            validar();
        }
    }

    private void validar() {
        String cad = "Seleccionado:  \n";

        if(r1.isChecked()){
            cad+="Opcion1\n";
        }

        if(r2.isChecked()){
            cad+="Opcion2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();

    }

}