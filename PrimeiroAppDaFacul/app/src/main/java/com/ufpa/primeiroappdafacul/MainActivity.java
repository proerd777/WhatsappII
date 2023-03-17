package com.ufpa.primeiroappdafacul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button btn_logar, btn_cadastrar;
    private EditText edt_email, edt_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instaciando os componentes do layout
        btn_logar = findViewById(R.id.buttonLogin);
        btn_cadastrar = findViewById(R.id.buttonCadastro);
        edt_email = findViewById(R.id.editEmail);
        edt_senha = findViewById(R.id.editSenha);

        btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Faz ae mano", Toast.LENGTH_SHORT).show();
            }
        });

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Em andamento...", Toast.LENGTH_SHORT).show();
            }
        });

        mAuth = FirebaseAuth.getInstance();


    }
}
