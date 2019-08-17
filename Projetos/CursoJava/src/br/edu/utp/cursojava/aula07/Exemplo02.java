package br.edu.utp.cursojava.aula07;

import br.edu.utp.cursojava.aula06.Conta;
import br.edu.utp.cursojava.aula06.ContaCorrente;

import java.util.*;

public class Exemplo02 {

    public static void main(String[] args) {

        // --- LISTA ---
        List<String> lista = new ArrayList<>();

        // Adiciona elementos na lista
        lista.add("banana");
        lista.add("laranja");
        lista.add("pera");
        lista.add("uva");

        // Percorre a lista
        for (String item : lista) {
            System.out.println(item);
        }

        // Remove um elemento
        System.out.println("Remove o primeiro elemento");
        lista.remove(0);

        System.out.println("Remove o ultimo elemento");
        lista.remove("uva");

        // Percorre a lista
        for (String item : lista) {
            System.out.println(item);
        }

        // Classe collections com metodos utilitarios
        Collections.sort(lista);    // ordena a lista
        Collections.shuffle(lista); // embaralha os elementos da lista
        String x = Collections.max(lista);    // maior elemento
        String y = Collections.min(lista);    // menor elemento

        // --- MAPAS / DICIONARIOS ---
        // Mapeamento de chave / valor
        // Map<String, Float> mapa = new TreeMap<>();
        Map<String, Float> mapa = new HashMap<>();

        mapa.put("laranja", 12.99f);
        mapa.put("pera", 10.99f);
        mapa.put("banana", 1.99f);
        mapa.put("banana", 2.99f);  // sobrescreve o valor

        float preco = mapa.get("laranja");
        System.out.println(preco);

        for (Map.Entry<String, Float> item: mapa.entrySet()) {
            System.out.println(item.getKey() +  " - " + item.getValue());
        }

        Map<Integer, Conta> mapaContas = new TreeMap<>();
        mapaContas.put(1, new ContaCorrente(1, 1234, "Fred"));
        mapaContas.put(2, new ContaCorrente(2, 1234, "Wilma"));
        mapaContas.put(3, new ContaCorrente(3, 1234, "Pedrita"));

        Conta conta = mapaContas.get(3);
        conta.imprime();

        Collection<Conta> contas = mapaContas.values();
        for (Conta c: contas)  {
            c.imprime();
        }


    }

}
