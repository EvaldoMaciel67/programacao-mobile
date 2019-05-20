package br.com.koruthos.cursoandroid.activities;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityViewpagerBinding;
import br.com.koruthos.cursoandroid.fragments.ExemploFragment;
import br.com.koruthos.cursoandroid.widgets.adapters.ExemploPageAdapter;

public class ViewPagerActivity extends FragmentActivity {

    private static final String TAG = "Perfil";
    private ActivityViewpagerBinding mBindind;

    private Fragment mFragmento1;
    private Fragment mFragmento2;
    private Fragment mFragmento3;
    private Fragment mFragmento4;

    private ExemploPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Amarração dos componentes do layout
        mBindind = DataBindingUtil.setContentView(this, R.layout.activity_viewpager);

        mFragmento1 = ExemploFragment.newInstance("Fragemento 1", 0);
        mFragmento2 = ExemploFragment.newInstance("Fragemento 2", 0);
        mFragmento3 = ExemploFragment.newInstance("Fragemento 3", 0);
        mFragmento4 = ExemploFragment.newInstance("Fragemento 4", 0);

        List<Fragment> fragmentos = new ArrayList<>();
        fragmentos.add(mFragmento1);
        fragmentos.add(mFragmento2);
        fragmentos.add(mFragmento3);
        fragmentos.add(mFragmento4);

        // Cadastra o adapter ao viewpager
        mAdapter = new ExemploPageAdapter(getSupportFragmentManager(), fragmentos);
        mBindind.viewpagerViewpager.setAdapter(mAdapter);

        // Amarracao do tablayout com o viewpager
        TabLayout tabs = mBindind.viewpagerTablayout;
        ViewPager viewPager = mBindind.viewpagerViewpager;

        viewPager.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.addOnTabSelectedListener(
                new TabLayout.ViewPagerOnTabSelectedListener(viewPager));





    }

}
