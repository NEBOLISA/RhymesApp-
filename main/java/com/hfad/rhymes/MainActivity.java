package com.hfad.rhymes;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        String names[]=new String[RhymeClass.rhymes.length];
        for(int i=0;i<names.length;i++){
            names[i]=RhymeClass.rhymes[i].getTitle();
        }
        int[] images=new int[RhymeClass.rhymes.length];
        for(int i=0;i<RhymeClass.rhymes.length;i++){
            images[i]=RhymeClass.rhymes[i].getImageId();
        }
        CustomAdapter myAdapter = new CustomAdapter(MainActivity.this,names,images);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}