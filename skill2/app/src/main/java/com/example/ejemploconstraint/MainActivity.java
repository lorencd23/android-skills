package com.example.ejemploconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{        // Con el implements es la forma 2 (Tradicional)

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This o getApplicationContext() es lo mismo, pero con la segunda es mejor
        // por si usamos eventos fuera de esta clase, ya que con this se usan claves anónimas
        Toast.makeText(getApplicationContext(), "Hola, esto es un Toast", Toast.LENGTH_LONG).show();

        btn1 = findViewById(R.id.button);       // Llamar evento mediante clase anonima

        btn2 = findViewById(R.id.button2);      // Llamar evento mediante tradicional
        btn2.setOnClickListener(this);

        // Esto funcionaría porque está fuera de la clase anónima
        /*
            Toast.makeText(this, "", Toast.LENGTH_SHORT);
        */

        // Forma 1 (Esto es la clase anonima)
        btn1.setOnClickListener(new View.OnClickListener() {    // OnClickListener() es una interfaz a la que le estamos dando un cuerpo con el override SIN NECESIDAD de IMPLEMENTS ARRIBA
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la anonima", Toast.LENGTH_LONG).show();
            }
        });
    }

    // Forma 2 (Tradicional)
    @Override
    public void onClick(View view) {

    /*
        if(view.getId() == btn2.getId()){
            Toast.makeText(getApplicationContext(), "Desde la tradicional", Toast.LENGTH_LONG).show();
        }

        if(view.getId() == R.id.button3){
            Toast.makeText(getApplicationContext(), "Desde onCLick nombrado en xml sobre escribiendo el tradicional ", Toast.LENGTH_LONG).show();
        }
    */
        switch (view.getId()){
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Desde onCLick nombrado en xml sobre escribiendo el tradicional ", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Desde la tradicional", Toast.LENGTH_LONG).show();
                break;
        }

    }

    // Forma 3 (Se nombra en xml y no hace falta crear un btn aqui en el MainActivity)
    // Ahora no se usa porque en el xml está llamando al método onClick (Tradicional)
    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(), "Desde onClick del metodo a parte nombrado en el xml", Toast.LENGTH_LONG).show();
    }
}