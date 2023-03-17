package com.ufpa.primeiroappdafacul;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button btn_logar, btn_cadastrar;
    private EditText edt_email, edt_senha;

    // Layout para criação de conta
    private Dialog dialog_cadastro;
    private Button btn_criarConta;
    private EditText edt_email_cadastro, edt_nick, edt_senha_cadastro;

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
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout_criacao_conta, null);

                builder.setCancelable(false);
                builder.setView(view);
                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog_cadastro.dismiss();
                    }
                });

                btn_criarConta = view.findViewById(R.id.buttonCriarConta);
                edt_nick = view.findViewById(R.id.editNick);
                edt_email_cadastro = view.findViewById(R.id.editEmailCadastro);
                edt_senha_cadastro = view.findViewById(R.id.editSenhaCadastro);

                btn_criarConta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cadastrar(
                                edt_email_cadastro.getText().toString(),
                                edt_senha_cadastro.getText().toString(),
                                edt_nick.getText().toString()
                        );
                    }
                });

            dialog_cadastro = builder.create();
            dialog_cadastro.show();
            }
        });

        mAuth = FirebaseAuth.getInstance();


    }

    public void cadastrar(String email, String senha, String nick){
        if
        (       email == null ||
                senha == null ||
                nick == null ||
                email.isEmpty() ||
                senha.isEmpty() ||
                nick.isEmpty()
        )
        {
            Toast.makeText(getApplicationContext(), "Existem campos vazios", Toast.LENGTH_SHORT).show();
        }else{

        }
    }
}
