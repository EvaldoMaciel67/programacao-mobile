package br.edu.utp.cursojava.aula06;

public class ExemploClasseAbstrata {

    public static void main(String[] args) {

        // ERRO: Não é possível instanciar classes abstratas
        // Conta conta = new Conta();

        ContaCorrente c1 = new ContaCorrente(1, 1234, "Donald");
        c1.depositar(1000);
        c1.aplicarJurosDiarios();
        c1.imprimirExtrato();

        ContaPoupanca c2 = new ContaPoupanca(2, 1234, "Patolino");
        c2.depositar(1000);
        c2.aplicarJurosDiarios();
        c2.imprimirExtrato();


    }

}
