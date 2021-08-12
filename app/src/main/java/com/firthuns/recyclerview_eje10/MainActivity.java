package com.firthuns.recyclerview_eje10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.firthuns.recyclerview_eje10.Adapter.OrdenadoresAdapter;
import com.firthuns.recyclerview_eje10.modelos.Ordenador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Ordenador>listaOrdenadores;
    private  int filaOrdenador;
    private RecyclerView recyclerView;
    // Adapter para el recyclerView
    private OrdenadoresAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filaOrdenador = R.layout.ordenador_card;
        listaOrdenadores = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerMain);

        inicializaDatos();
        // permite tener diferentes layouts> contenedores <
        LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(this  );
        LinearLayoutManager linearLayoutManagerHorizontal = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false  );
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManagerVertical);
        adapter = new OrdenadoresAdapter(listaOrdenadores, filaOrdenador, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));



    }

    private void inicializaDatos() {
        for (int i = 0; i < 1000; i++) {
            listaOrdenadores.add(new Ordenador("MARCA", "MODELO", 15, 3.6F));

        }
    }



}