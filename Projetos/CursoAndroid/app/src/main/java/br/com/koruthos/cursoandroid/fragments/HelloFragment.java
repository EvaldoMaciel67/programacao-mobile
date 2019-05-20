package br.com.koruthos.cursoandroid.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import br.com.koruthos.cursoandroid.R;

public class HelloFragment extends Fragment {

    /**
     * Este metodo eh chamado qndo o fragmento eh criado!
     *
     * @param context   Activity pai
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Verifica se a activity pai implementou os métodos para tratamento
        // dos sinais enviados pelo fragmento
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Extrai os dados enviados pela activity
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Carrega o layout para dentro do fragmento
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // Libera as amarracoes
    }

}
