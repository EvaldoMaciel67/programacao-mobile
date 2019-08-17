package br.edu.utp.cursojava.aula07;

import br.edu.utp.cursojava.aula06.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args){
        CaixaInt c1 = new CaixaInt(10);
        c1.imprime();

        CaixaString c2 = new CaixaString("banana");
        c2.imprime();

        // Na instanciacao do objeto eh que o tipo eh definido
        // Só pode utilizar tipos referencia - nao pode usar um tipo primitivo
        Caixa<Integer> c3 = new Caixa<>(12);
        c3.imprime();

        Caixa<String> c4 = new Caixa<>("laranja");
        c4.imprime();

        Caixa<Float> c5 = new Caixa<>(7.32f);
        c5.imprime();

        Caixa<Caixa<Integer>> c6 = new Caixa<>(c3);
        c6.imprime();

        Caixa<Cliente> c7 = new Caixa<>(new Cliente("Magali"));
        c7.imprime();

        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("Bidu"));

    }

}
