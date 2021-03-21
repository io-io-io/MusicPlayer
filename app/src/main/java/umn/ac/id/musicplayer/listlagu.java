package umn.ac.id.musicplayer;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;


public class listlagu<MusicAdapter> extends AppCompatActivity {

    RecyclerView recyclerView;
    umn.ac.id.musicplayer.MusicAdapter musicAdapter;
    Dialog mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listlagu);
        Objects.requireNonNull(getSupportActionBar()).setTitle("List Music");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDialog = new Dialog(this);
        mDialog.setContentView(R.layout.popup);
        mDialog.show();


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);


        ArrayList<MusicFile> musicFiles = null;
        if (!(musicFiles.size() < 1)) {
            musicAdapter = new umn.ac.id.musicplayer.MusicAdapter(this, musicFiles);
            recyclerView.setAdapter((RecyclerView.Adapter) musicAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.goProfile) {
            Intent intent = new Intent(listlagu.this, profil.class);
            startActivity(intent);
            finish();
            return true;
        }
        if (id == R.id.goLogout) {
            Intent intent = new Intent(listlagu.this, MainActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}