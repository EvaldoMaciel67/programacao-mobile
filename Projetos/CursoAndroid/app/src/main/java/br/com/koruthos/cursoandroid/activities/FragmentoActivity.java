package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityFragmentoBinding;

public class FragmentoActivity extends AppCompatActivity {

    private static final String TAG = "Perfil";
    private ActivityFragmentoBinding mBindind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Amarração dos componentes do layout
        mBindind = DataBindingUtil.setContentView(this, R.layout.activity_fragmento);

    }



}
