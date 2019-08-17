package br.edu.utp.cursojava.aula06;

import java.util.ArrayList;
import java.util.List;

public class ExemploInterface {

    public static void main(String[] args) {

        List<Imprimivel> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1, 1234, "Donald"));
        contas.add(new ContaPoupanca(2, 1234, "Patolino"));
        contas.add(new ContaPoupanca(3, 1234, "Zé Carioca"));
        contas.add(new ContaCorrente(4, 1234, "Frangolino"));
        contas.add(new Cliente("Monica"));
        contas.add(new Cliente("Cebolinha"));
        contas.add(new Anonima());

        // Classe anonima - existe somente uma instancia dela
        // - Pode ser criada atraves de interface ou classe abstrata
        Imprimivel anonima = new Imprimivel() {
            @Override
            public void imprime() {
                System.out.println("Imprimivel");
            }
        };

        contas.add(anonima);

        // Funcao lambda - Declara uma referencia para uma funcao
        // Só funciona para interfaces com 1 metodo apenas
        // Usado para metodos de callback
        // Sintaxe:
        //      (<parametros>) -> <comando>
        //      (<parametros>) -> {<comandos;>}
        //      <Classe>::<metodo estatico>
        Imprimivel lambda1 = () -> System.out.println("Imprimivel - lambda1");
        
        Imprimivel lambda2 = () -> {
            System.out.println("Imprimivel - lambda2");
        };
        
        Imprimivel lambda3 = ExemploInterface::funcaoLambda;

        contas.add(lambda1);
        contas.add(lambda2);
        contas.add(lambda3);
        
        for (Imprimivel i : contas) {
            i.imprime();
        }

    }


    public static void funcaoLambda() {
        System.out.println("Imprimivel - lambda3");
    }
    
}
