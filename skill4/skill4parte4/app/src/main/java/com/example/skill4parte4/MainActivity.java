package com.example.skill4parte4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgbtn;
    TextView txtEti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbtn = (ToggleButton) findViewById(R.id.tgBtn1);
        txtEti = (TextView) findViewById(R.id.etiSeleccion);

    }

    public void onclick(View view){
        if(view.getId() == R.id.tgBtn1){
            if(tgbtn.isChecked()){
                txtEti.setText("Boton On");
            }else{
                txtEti.setText("Boton Off");
            }
        }
    }

}