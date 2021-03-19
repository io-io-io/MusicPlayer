package umn.ac.id.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username, password;
    Button btn_login;
    String usernameuas = "uasmobile";
    String passworduas = "uasmobilegenap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Halaman Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(login.this, "Username / Password tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals(usernameuas)){
                    //jika username benar, cek password
                    if(password.getText().toString().equals(passworduas)){
                        Toast.makeText(login.this, "Login berhasil", Toast.LENGTH_LONG).show();
                        openList();
                    }else{
                        Toast.makeText(login.this, "Username atau Password salah", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(login.this, "Username atau Password salah", Toast.LENGTH_LONG).show();

                }
            }
        });

    }

    public void openList() {
        Intent intent = new Intent (this, umn.ac.id.musicplayer.listlagu.class);
        startActivity(intent);
    }

}