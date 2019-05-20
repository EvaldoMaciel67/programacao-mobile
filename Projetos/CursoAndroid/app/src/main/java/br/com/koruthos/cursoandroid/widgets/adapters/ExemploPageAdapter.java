package br.com.koruthos.cursoandroid.widgets.adapters;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ExemploPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragments;

    public ExemploPageAdapter(@NonNull final FragmentManager fm, List<Fragment> fragmentos) {
        super(fm);
        mFragments = fragmentos;
    }

    @NonNull
    @Override
    public Fragment getItem(final int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
