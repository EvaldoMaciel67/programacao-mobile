package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;

import com.google.gson.Gson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityPersistenciaBinding;
import br.com.koruthos.cursoandroid.model.Perfil;
import br.com.koruthos.cursoandroid.util.PersistenciaUtil;

public class PersistenciaActivity extends AppCompatActivity {

    private static final String TAG = "Perfil";
    private ActivityPersistenciaBinding mBindind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Amarração dos componentes do layout
        mBindind = DataBindingUtil.setContentView(this, R.layout.activity_persistencia);

        mBindind.persistenciaBtn1.setOnClickListener(v -> onBotao1Click());
        mBindind.persistenciaBtn2.setOnClickListener(v -> onBotao2Click());

        Perfil perfil = PersistenciaUtil.loadPerfil(this);
        mBindind.persistenciaTxtJson.setText(perfil.getNome());

    }

    private void onBotao1Click() {
        Perfil perfil = new Perfil();
        perfil.setNome("Judite");
        perfil.setPeso(70);
        perfil.setAltura(1.80f);
        perfil.setEmail("judite@email.com");

        PersistenciaUtil.savePerfil(this, perfil);
    }

    private void onBotao2Click() {
        Perfil perfil = PersistenciaUtil.loadPerfil(this);

        Gson gson = new Gson();
        String json = gson.toJson(perfil, Perfil.class);
        mBindind.persistenciaTxtJson.setText(json);
    }


}
