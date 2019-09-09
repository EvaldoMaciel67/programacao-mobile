package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityVisibilidadeBinding;

public class VisibilidadeActivity extends AppCompatActivity {

    private static final String TAG = "Visibilidade";

    /**
     * Declara uma variável para acessar o objeto de binding dos componentes
     * da tela da activity.
     */
    private ActivityVisibilidadeBinding mBinding;

    /**
     * Tarefas do onCreate()
     * - Define o layout que será carregado na activity
     * - Define os eventos
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_visibilidade);

        // Esconde todos os textos
        mBinding.visibilidadeTxtMensagem1.setVisibility(View.GONE);
        mBinding.visibilidadeTxtMensagem2.setVisibility(View.GONE);
        mBinding.visibilidadeTxtMensagem3.setVisibility(View.GONE);

        // Cadastra os eventos
        mBinding.visibilidadeBtnExibirTodos.setOnClickListener(v -> {
            mBinding.visibilidadeTxtMensagem1.setVisibility(View.VISIBLE);
            mBinding.visibilidadeTxtMensagem2.setVisibility(View.VISIBLE);
            mBinding.visibilidadeTxtMensagem3.setVisibility(View.VISIBLE);
        });

        mBinding.visibilidadeBtnEsconder2.setOnClickListener(v ->{
            mBinding.visibilidadeTxtMensagem2.setVisibility(View.INVISIBLE);
        });

        mBinding.visibilidadeBtnEliminar2.setOnClickListener(v ->{
            mBinding.visibilidadeTxtMensagem2.setVisibility(View.GONE);
        });

        mBinding.visibilidadeBtnExibir2.setOnClickListener(v ->{
            mBinding.visibilidadeTxtMensagem2.setVisibility(View.VISIBLE);
        });




    }

}
