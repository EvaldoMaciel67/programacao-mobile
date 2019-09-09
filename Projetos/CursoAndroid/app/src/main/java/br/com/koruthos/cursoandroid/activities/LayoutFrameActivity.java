package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityLayoutFrameBinding;

public class LayoutFrameActivity extends AppCompatActivity {

    private static final String TAG = "Frame";

    /**
     * Declara uma variável para acessar o objeto de binding dos componentes
     * da tela da activity.
     */
    private ActivityLayoutFrameBinding mBinding;

    /**
     * Tarefas do onCreate()
     * - Define o layout que será carregado na activity
     * - Define os eventos
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_layout_frame);
    }

}
