package br.edu.utp.cursojava.aula06;

import java.util.*;

public class ExemploCollections {

    public static void main(String[] args) {

        // Cria uma lista de contas
        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1, 1234, "Donald"));
        contas.add(new ContaPoupanca(2, 1234, "Patolino"));
        contas.add(new ContaPoupanca(3, 1234, "Zé Carioca"));
        contas.add(new ContaCorrente(4, 1234, "Frangolino"));

        // Deposita quantias aleatorias nas contas
        Random random = new Random();
        for (Conta conta : contas) {
            float valor = random.nextFloat() * 10_000;
            conta.depositar(valor);
        }

        // Ordena a lista de contas - usa comparable
        Collections.sort(contas);

        // Imprime a lista de contas
        System.out.println("ORDENA POR SALDO: ");
        for (Conta conta : contas) {
            conta.imprime();
        }

        // Ordena usando uma classe anonima
        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta o1, Conta o2) {
                String nome1 = o1.getCliente();
                String nome2 = o2.getCliente();
                return nome1.compareTo(nome2);
            }
        });

        // Ordena usando expressao lambda
        contas.sort((o1, o2) -> o1.getCliente().compareTo(o2.getCliente()));
        // contas.sort(Comparator.comparing(Conta::getCliente));

        // Imprime a lista de contas
        System.out.println("ORDENA POR CLIENTE: ");
        for (Conta conta : contas) {
            conta.imprime();
        }

    }


}
