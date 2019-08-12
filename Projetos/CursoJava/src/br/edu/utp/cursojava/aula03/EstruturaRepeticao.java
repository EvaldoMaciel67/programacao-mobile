package br.edu.utp.cursojava.aula03;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        // for
//        System.out.println("for");
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d, ", i);
//        }
//        System.out.println();
//
//        // while
//        System.out.println("while");
//
//        // Exemplo de laço infinito
//        while (true) {
//            System.out.print("Digite um numero: ");
//            int numero = teclado.nextInt();
//
//            System.out.println(numero);
//
//            if (numero < 0) {
//                System.out.println("Saindo do loop infinito");
//                break;
//            }
//        }
//
//        // do / while
//        int numero;
//        System.out.println("do/while");
//        do {
//            System.out.print("Digite um numero: ");
//            numero = teclado.nextInt();
//
//            System.out.println(numero);
//        } while (numero > 0);

        // foreach - percorre uma coleção de dados
        //         - Arrays ou Collections
        int[] numeros = {1, 2, 3, 4, 5, 6};

        for (int numero : numeros) {
            System.out.println("Numero = " + numero);
        }

        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 10);
        }
        
        // Codigo analogo ao codigo do foreach
//        for (int i = 0; i < numerosAleatorios.length; i++) {
//            int numero = numerosAleatorios[i];
//            System.out.println("Numero Aleatorio = " + numero);
//        }

        for (int numero : numerosAleatorios) {
            System.out.println("Numero Aleatorio = " + numero);
        }

    }
}
