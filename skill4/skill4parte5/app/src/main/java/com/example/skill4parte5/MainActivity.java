package com.example.skill4parte5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtEti;
    Switch switchE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEti = (TextView) findViewById(R.id.etiSeleccion);
        switchE = (Switch) findViewById(R.id.idSwitch);
    }

    public void onclick(View view) {
        if(view.getId() == R.id.idSwitch){
            if(switchE.isChecked()){
                txtEti.setText("Fue activado");
            }else{
                txtEti.setText("Fue desactivado");
            }
        }
    }
}