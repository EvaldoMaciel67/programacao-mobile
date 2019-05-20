package br.com.koruthos.cursoandroid.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.FragmentExemploBinding;

public class ExemploFragment extends Fragment {

    private String mNome = "";
    private int mIdade = 0;

    private FragmentExemploBinding mBinding;

    private ExemploListener mListener;

    /** Metodo Estatico para construcao de fragmentos */
    public static ExemploFragment newInstance(String nome, int idade) {
        ExemploFragment fragmento = new ExemploFragment();

        // Parametros de inicializacao do fragmento
        Bundle args = new Bundle();
        args.putString("nome", nome);
        args.putInt("idade", idade);
        fragmento.setArguments(args);
        return fragmento;
    }

    /**
     * Este metodo eh chamado qndo o fragmento eh criado!
     *
     * @param context Activity pai
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Verifica se a activity pai implementou os métodos para tratamento
        // dos sinais enviados pelo fragmento
        try {
            mListener = (ExemploListener) context;
        } catch (ClassCastException ex) {
            //throw new ClassCastException(context.toString() + " deve implementar o ExemploListener!");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Extrai os dados enviados pela activity
        if (getArguments() != null) {
            mNome = getArguments().getString("nome");
            mIdade = getArguments().getInt("idade");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Carrega o layout para dentro do fragmento
        // 1. Maneira tradicional SEM data binding
        // return inflater.inflate(R.layout.fragment_exemplo, container, false);

        // 2. Maneira com databinding
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_exemplo,
                container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mBinding.setNome(mNome);
        mBinding.setIdade(mIdade);

        mBinding.exemploBtnAtualizaTitulo.setOnClickListener(v -> atualizaTitulo());

    }

    @Override
    public void onDetach() {
        super.onDetach();
        // Libera as amarracoes
    }

    private void atualizaTitulo() {
        String texto = mBinding.exemploEditTitulo.getText().toString();
        mListener.onAlteraTitulo(texto);
    }

    interface ExemploListener {
        void onAlteraTitulo(String titulo);
    }

}
