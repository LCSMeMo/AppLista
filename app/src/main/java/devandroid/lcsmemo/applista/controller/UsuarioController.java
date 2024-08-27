package devandroid.lcsmemo.applista.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.lcsmemo.applista.model.Usuario;

public class UsuarioController {


    @NonNull
    @Override
    public String toString() {
        Log.d("CONTROLLER_MVC", "CONTROLLER INICIADA... ");
        return super.toString();
    }

    public void salvar(Usuario usuario) {
        Log.d("CONTROLLER_MVC", "DADOS SALVOS: "+usuario.toString());
    }
}
