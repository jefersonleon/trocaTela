package br.ulbra.sistemacomtelas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {
    private EditText ednome;
    private RadioGroup rgopcao;
    private RadioButton rbFem, rbMasc;
    private Button btSalvar;
    private TextView txtResultado;
    String nome, resultado;
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();//ocultar titulo da aplicação
        iniciarComponentes();
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = ednome.getText().toString();
                op = rgopcao.getCheckedRadioButtonId();
                switch (op) {
                    case R.id.rbFeminino:
                        resultado = "Sra." + nome;
                        break;
                    default:
                        resultado = "Sr." + nome;
                        break;
                }
                txtResultado.setText(resultado);
                /*
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Cadastro.this);
                dialogo.setTitle("Resultado");
                dialogo.setMessage(resultado);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();

                 */
            }
        });


    }

    private void iniciarComponentes() {
        ednome = findViewById(R.id.edNome);
        rgopcao = findViewById(R.id.rgOpcao);
        rbFem = findViewById(R.id.rbFeminino);
        rbMasc = findViewById(R.id.rbMasculino);
        btSalvar = findViewById(R.id.btSalvar);
        txtResultado = findViewById(R.id.txtResultado);
    }
}