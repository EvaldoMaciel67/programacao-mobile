package br.com.koruthos.cursoandroid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    /**
     * Declara uma variável para acessar o objeto de binding dos componentes
     * da tela da activity.
     */
    private ActivityMainBinding mBinding;

    /**
     * Tarefas do onCreate()
     * - Define o layout que será carregado na activity
     * - Define os eventos
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        // Carrega o layout através do data binding
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Acesso às views do layout
        mBinding.mainTxtHello.setText(R.string.alo_mamae);

        // Cadastra os eventos nos botoes
        mBinding.mainBtnLinearHorizontal.setOnClickListener(v -> exibirActivityLinear());

        // --- MODO TRADICIONAL ----
        // Define o layout da activity
        //setContentView(R.layout.activity_main);

        // Modo tradicional de acesso às views do layout
        //TextView hello = findViewById(R.id.hello);
        //hello.setText("Alô, mamãe!");
        // --- FIM MODO TRADICIONAL ----

        // Tipos de log
        Log.v(TAG, "onCreate: VERBOSE");
        Log.d(TAG, "onCreate: DEBUG");
        Log.i(TAG, "onCreate: INFO");
        Log.w(TAG, "onCreate: WARN");
        Log.e(TAG, "onCreate: ERROR");
        Log.wtf(TAG, "onCreate: WTF?");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    private void exibirActivityLinear() {
        Log.d(TAG, "exibirActivityLinear: ");

        // Intenções são usadas para invocar alguma outra activity
        Intent it = new Intent(this, LayoutLinearActivity.class);
        startActivity(it);

    }




}
