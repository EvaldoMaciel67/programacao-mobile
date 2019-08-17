package br.edu.utp.cursojava.aula06;

import java.util.Comparator;

public abstract class Conta implements Imprimivel, Comparable<Conta> {

    private int numero;
    private int agencia;
    private String cliente;
    private long saldo;

    public Conta(int numero, int agencia, String cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente.toUpperCase();
        this.saldo = 0;
    }

    public void depositar(float quantia) {
        this.saldo += (long) (quantia * 100);
    }

    public void retirar(float quantia) {
        this.saldo -= (long) (quantia * 100);
    }

    public float getSaldo() {
        return this.saldo / 100f;
    }

    public void setSaldo(float saldo) {
        this.saldo = (long) (saldo * 100);
    }

    public void imprimirExtrato() {
        System.out.printf("Conta.....: %05d/%04d\n", numero, agencia);
        System.out.printf("Cliente...: %s\n", cliente);
        System.out.printf("Saldo.....: %.2f\n", getSaldo());
    }

    public abstract void aplicarJurosDiarios();

    @Override
    public void imprime() {
        System.out.printf("%-15s %10.2f\n", cliente, getSaldo());
    }

    public String getCliente() {
        return cliente;
    }

    // Sobrescreve o metodo da interface comparable
    @Override
    public int compareTo(Conta outra) {
        // this == outra        retorna 0
        // this >  outra        retorna +
        // this <  outra        retorna -

//        if (saldo > outra.saldo) {
//            return 1;
//        } else if (saldo < outra.saldo) {
//            return -1;
//        } else {
//            return 0;
//        }

        return (int) (this.saldo - outra.saldo);
    }
}





