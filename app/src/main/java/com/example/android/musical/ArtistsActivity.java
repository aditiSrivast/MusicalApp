package com.example.android.musical;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        TextView bazangi = (TextView) findViewById(R.id.bazangi);
        bazangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bazangiIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(bazangiIntent);
            }
        });
        TextView coldplay = (TextView) findViewById(R.id.coldplay);
        coldplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coldplayIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(coldplayIntent);
            }
        });
        TextView chainsmokers = (TextView) findViewById(R.id.chainsmokers);
        chainsmokers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chainsmokersIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(chainsmokersIntent);
            }
        });
        TextView future = (TextView) findViewById(R.id.future);
        future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent futureIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(futureIntent);
            }
        });
        TextView edsheeran = (TextView) findViewById(R.id.edsheeran);
        edsheeran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edsheeranIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(edsheeranIntent);
            }
        });
    }
}
