package br.com.koruthos.cursoandroid.model;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.Date;

public class Perfil {

    @SerializedName("nome")
    private String mNome = "";

    @SerializedName("foto_url")
    private String mFoto = "";

    @SerializedName("email")
    private String mEmail = "";

    // transient: indica que a variavel nao eh serializavel
    transient private Date mAniversario = Calendar.getInstance().getTime();

    @SerializedName("altura")
    private float mAltura = 0;

    @SerializedName("peso")
    private float mPeso = 0;

    public String getNome() {
        return mNome;
    }

    public void setNome(final String nome) {
        mNome = nome;
    }

    public String getFoto() {
        return mFoto;
    }

    public void setFoto(final String foto) {
        mFoto = foto;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(final String email) {
        mEmail = email;
    }

    public Date getAniversario() {
        return mAniversario;
    }

    public void setAniversario(final Date aniversario) {
        mAniversario = aniversario;
    }

    public float getAltura() {
        return mAltura;
    }

    public void setAltura(final float altura) {
        mAltura = altura;
    }

    public float getPeso() {
        return mPeso;
    }

    public void setPeso(final float peso) {
        mPeso = peso;
    }
}
