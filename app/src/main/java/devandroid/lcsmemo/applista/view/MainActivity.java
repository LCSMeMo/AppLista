package devandroid.lcsmemo.applista.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.lcsmemo.applista.R;
import devandroid.lcsmemo.applista.model.Usuario;

public class MainActivity extends AppCompatActivity {

    Usuario usuario;
    Usuario outroUsuario;

    String dadosUsuario;
    String dadosOutroUsuario;


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

        usuario.setPrimeiroNome("Lucas");
        usuario.setSobreNome("Moura");
        usuario.setCursoDesejado("Android");
        usuario.setTelefoneContato("(11) 99999-9999");

        outroUsuario = new Usuario();
        outroUsuario.setPrimeiroNome("Marcos");
        outroUsuario.setSobreNome("Leandro");
        outroUsuario.setCursoDesejado("Java");
        outroUsuario.setTelefoneContato("(11) 99999-9992");

        dadosUsuario = "Primeiro Nome: ";
        dadosUsuario += usuario.getPrimeiroNome();
        dadosUsuario += " Sobrenome: ";
        dadosUsuario += usuario.getSobreNome();
        dadosUsuario += " Curso Desejado: ";
        dadosUsuario += usuario.getCursoDesejado();
        dadosUsuario += " Telefone de Contato: ";
        dadosUsuario += usuario.getTelefoneContato();

        dadosOutroUsuario = "Primeiro Nome: ";
        dadosOutroUsuario += outroUsuario.getPrimeiroNome();
        dadosOutroUsuario += " Sobrenome: ";
        dadosOutroUsuario += outroUsuario.getSobreNome();
        dadosOutroUsuario += " Curso Desejado: ";
        dadosOutroUsuario += outroUsuario.getCursoDesejado();
        dadosOutroUsuario += " Telefone de Contato: ";
        dadosOutroUsuario += outroUsuario.getTelefoneContato();

        int parada = 0;



    }

}