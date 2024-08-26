package devandroid.lcsmemo.applista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.lcsmemo.applista.R;
import devandroid.lcsmemo.applista.model.Usuario;

public class MainActivity extends AppCompatActivity {

    Usuario usuario;
    EditText editPrimeiroNome, editSobrenome, editNomeDoCurso, editTelefoneDeContato;
    Button btnSalvar, btnLimpar, btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        usuario = new Usuario();

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefoneDeContato = findViewById(R.id.editTelefoneDeContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

    btnSalvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            usuario.setPrimeiroNome(editPrimeiroNome.getText().toString());
            usuario.setSobreNome(editSobrenome.getText().toString());
            usuario.setCursoDesejado(editNomeDoCurso.getText().toString());
            usuario.setTelefoneContato(editTelefoneDeContato.getText().toString());
            Toast.makeText(MainActivity.this, "Dados Salvos"+usuario.toString(), Toast.LENGTH_SHORT).show();
        }
    });
    btnFinalizar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Finalizando", Toast.LENGTH_SHORT).show();
            finish();
        }
    });
    btnLimpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editPrimeiroNome.setText("");
            editSobrenome.setText("");
            editNomeDoCurso.setText("");
            editTelefoneDeContato.setText("");
            Toast.makeText(MainActivity.this, "Limpando", Toast.LENGTH_SHORT).show();
        }
    });





        Log.i("POO ANDROID",usuario.toString());



    }

}