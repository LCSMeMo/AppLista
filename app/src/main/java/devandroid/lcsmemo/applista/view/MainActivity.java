package devandroid.lcsmemo.applista.view;

import android.os.Bundle;
import android.util.Log;

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

//        dadosUsuario = "Primeiro Nome: "+usuario.getPrimeiroNome()+" Sobrenome: "+usuario.getSobreNome()+
//                " Curso Desejado: "+usuario.getCursoDesejado()+" Telefone de Contato: "+usuario.getTelefoneContato();
//
//        dadosOutroUsuario = "Primeiro Nome: "+outroUsuario.getPrimeiroNome()+" Sobrenome: "+outroUsuario.getSobreNome()+
//                " Curso Desejado: "+outroUsuario.getCursoDesejado()+" Telefone de Contato: "+outroUsuario.getTelefoneContato();


        Log.i("POO ANDROID",usuario.toString());
        Log.i("POO ANDROID",outroUsuario.toString());



    }

}