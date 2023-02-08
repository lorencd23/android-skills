package com.example.skill5parte2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
        
        llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);

    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty", "El payaso", R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homer", "Homer no homero", R.drawable.homero));
        listaPersonajes.add(new PersonajeVo("Marge", "El pelo perfecto para ocultar cositas", R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart", "Alias el Barto", R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa", "Lisa necesita un aparato", R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Magie", "Sabe más de lo que aparenta", R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders", "Como si no llevara nada", R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Milhouse", "A nadie le importa :/", R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Sr. Burns", "Excelente", R.drawable.burns));

    }
}