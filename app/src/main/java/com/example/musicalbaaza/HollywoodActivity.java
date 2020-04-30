package com.example.musicalbaaza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HollywoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Luis Fonsi","Despacito"));
        songs.add(new Song("ED Sheeran","Shape Of You"));
        songs.add(new Song("Selena Gomez","Bad Liar"));
        songs.add(new Song("Katy Perry","Hey Hey Hey"));
        songs.add(new Song("Shakira","Toneladas"));
        songs.add(new Song("Adele","Skyfall"));
        songs.add(new Song("Selena Gomez","It Ain’t Me"));
        songs.add(new Song("Lady Gaga","Perfect Illusion"));
        songs.add(new Song("Bebe Rexha","I Got You"));
        songs.add(new Song("Rihanna","Sledgehammer"));
        songs.add(new Song("Beyoncé","Love Drought"));
        songs.add(new Song("Zayn Malik","LIKE I WOULD"));

        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
