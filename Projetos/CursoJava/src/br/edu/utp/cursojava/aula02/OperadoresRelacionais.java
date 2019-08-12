package br.edu.utp.cursojava.aula02;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperadoresRelacionais {
    
    public static void main(String[] args){

        // Declara uma variavel para leitura do teclado
        Scanner teclado = new Scanner(System.in);

        // Operadores relacionais
        //      (numero) op (numero) -> (booleano)
        //
        //  ==  igualdade
        //  !=  diferença
        //  >   maior
        //  >=  maior ou igual
        //  <   menor
        //  <=  menor ou igual

        System.out.println("Digite dois números inteiros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        System.out.printf("%d == %d  -> %b\n", x, y, x == y);
        System.out.printf("%d != %d  -> %b\n", x, y, x != y);
        System.out.printf("%d >  %d  -> %b\n", x, y, x >  y);
        System.out.printf("%d >= %d  -> %b\n", x, y, x >= y);
        System.out.printf("%d <  %d  -> %b\n", x, y, x <  y);
        System.out.printf("%d <= %d  -> %b\n", x, y, x <= y);

        // Não usar operador == e != para números reais (float e double)
        float a = 3;
        float b = 3;

        System.out.printf("%f == %f  -> %b\n", a, b, a == b);

        // Exemplo de imprecisão do ponto flutuante
        float valor = 0;

        for (int i = 0; i < 1000000; i++) {
            valor = valor + 0.1f;
        }

        System.out.printf("%f == %f  -> %b\n", valor, 100000.0f, valor == 100000.0f);

        // Para manipular valores monetarios: BigDecimal








    }
}
