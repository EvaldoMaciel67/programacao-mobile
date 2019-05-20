package br.com.koruthos.cursoandroid.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import br.com.koruthos.cursoandroid.model.Perfil;

public class PersistenciaUtil {

    private static final String ARQUIVO = "dados";

    private static final String PERFIL = "perfil";

    /**
     * Criacao da classe utilitaria: construtor privado garante que nenhum objeto
     * sera instanciado
     */
    private PersistenciaUtil() {
        // vazio
    }

    public static void savePerfil(Context context, Perfil perfil) {
        SharedPreferences.Editor editor = context.getSharedPreferences(ARQUIVO,
                Context.MODE_PRIVATE).edit();

        // Converte um objeto pra JSON
        Gson gson = new Gson();
        String json = gson.toJson(perfil, Perfil.class);
        Log.d("JSON","PersistenciaUtil.savePerfil: " + json);

        editor.putString(PERFIL, json);
        editor.apply();
    }

    public static Perfil loadPerfil(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(ARQUIVO,
                Context.MODE_PRIVATE);

        // Primeiro parametro: chave da escrita
        // Segundo parametro: Valor default
        String json = preferences.getString(PERFIL, "");

        // Tratamento para nao quebrar a aplicacao
        if (json.isEmpty()) {
            return new Perfil();
        }

        Gson gson = new Gson();
        return gson.fromJson(json, Perfil.class);
    }



}
