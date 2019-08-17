package br.edu.utp.cursojava.aula06;

public class Cliente implements Imprimivel {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    @Override
    public void imprime() {
        System.out.println(nome);
    }
}
