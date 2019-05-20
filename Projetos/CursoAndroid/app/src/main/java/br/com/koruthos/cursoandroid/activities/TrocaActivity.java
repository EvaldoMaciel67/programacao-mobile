package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityTrocaBinding;
import br.com.koruthos.cursoandroid.fragments.ExemploFragment;



public class TrocaActivity extends FragmentActivity {

    private static final String TAG = "Perfil";
    private ActivityTrocaBinding mBindind;

    private Fragment mFragmento1;
    private Fragment mFragmento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Amarração dos componentes do layout
        mBindind = DataBindingUtil.setContentView(this, R.layout.activity_troca);

        mFragmento1 = ExemploFragment.newInstance("Roberto", 28);
        mFragmento2 = ExemploFragment.newInstance("Julia", 21);


    }


    private void trocaFragmentos(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.replace(R.id.troca_fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
