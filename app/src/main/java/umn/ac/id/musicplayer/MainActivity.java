package umn.ac.id.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button profil, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk pindah ke activity profil saat klik button
        profil = (Button) this.findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfil();
            }
        });

        //untuk pindah ke activity login saat klik button
        login = (Button) this.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    //function yang dipanggil saat onclick
    public void openProfil() {
        Intent intent = new Intent(this, umn.ac.id.musicplayer.profil.class);
        startActivity(intent);
    }

    public void openLogin() {
        Intent intent = new Intent (this, umn.ac.id.musicplayer.login.class);
        startActivity(intent);
    }


}