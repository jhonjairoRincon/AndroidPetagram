package com.jj.petagram;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pets> petsList;
    private RecyclerView rcPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petsList = new ArrayList<>();
        rcPets = findViewById(R.id.rcPets);
        rcPets.setLayoutManager(new LinearLayoutManager(this));

        AdapterMain adapter = new AdapterMain(this.petsList, this  );
        this.rcPets.setAdapter(adapter);

        this.pets();
    }
    private void pets(){
        petsList.add( new Pets(R.drawable.fyru,"fyru","2"));
    }
}

