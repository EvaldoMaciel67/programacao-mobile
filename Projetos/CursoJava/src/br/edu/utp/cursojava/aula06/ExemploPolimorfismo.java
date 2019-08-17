package br.edu.utp.cursojava.aula06;

import br.edu.utp.cursojava.aula04.Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploPolimorfismo {

    public static void main(String[] args) {

        // Polimorfismo:
        // - Um objeto pode assumir diferentes formas
        // - Precisa do conceito de heranca

        Conta c1 = new ContaCorrente(1, 1234, "Donald");
        Conta c2 = new ContaPoupanca(2, 1234, "Patolino");

        // Perigoso realizar conversão de classe pai para filha
        // instanceof = verifica a classe de um objeto
        if (c1 instanceof ContaCorrente) {
            System.out.println("c1 é conta corrente");
            ContaCorrente conta = (ContaCorrente) c1;
        }

        // Polimorfismo é usado para abstração do código
        List<Conta> contas = new LinkedList<>();

        contas.add(c1);
        contas.add(c2);
        contas.add(new ContaCorrente(3, 1234, "Zé Carioca"));
        contas.add(new ContaPoupanca(4, 1234, "Frangolino"));

        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }


    }


}
