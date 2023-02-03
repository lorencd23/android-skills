package com.example.skill4parte11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDias;
    TextView etiSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDias = (ListView) findViewById(R.id.listViewId);
        etiSeleccion = (TextView) findViewById(R.id.txtId);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("Paco");
        listaNombres.add("Maria");
        listaNombres.add("Lucia");

        for(int i = 0; i<10; i++){
            listaNombres.add("Nombre " + i);
        }

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNombres);

        listaDias.setAdapter(adaptador);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Selecciona: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                etiSeleccion.setText("Seleccion: " + parent.getItemAtPosition(position).toString());
            }
        });
    }
}