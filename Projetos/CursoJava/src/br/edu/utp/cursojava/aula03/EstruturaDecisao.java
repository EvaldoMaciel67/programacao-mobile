package br.edu.utp.cursojava.aula03;

import java.util.Scanner;

public class EstruturaDecisao {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        // if
        // if / else
        // if / else if / else
        if (numero < 0) {
            System.out.println("Número é negativo!");
        } else if (numero > 0) {
            System.out.println("Número é positivo!");
        } else {
            System.out.println("Número é nulo!");
        }

        // switch / case
        System.out.println("Digite um mes: ");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês tem 31 dias!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês tem 30 dias!");
                break;
            case 2:
                System.out.println("O mês tem 28/29 dias!");
                break;
            default:
                System.out.println("Mês inválido!");
        }

    }

}
