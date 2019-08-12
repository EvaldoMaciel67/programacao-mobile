package br.edu.utp.cursojava.aula02;

// import: funciona de maneira análoga ao #include do C e C++
import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args){

        // Declara uma variavel para leitura do teclado
        Scanner teclado = new Scanner(System.in);

        // Operadores aritméticos
        //      (numero) op (numero) -> (numero)
        //
        //  +   soma
        //  -   subtração
        //  *   multiplicação
        //  /   divisão
        //  %   resto

        System.out.println("Digite dois número inteiros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        int resultado1 = x + y;
        System.out.printf("%d + %d = %d\n", x, y, resultado1);

        int resultado2 = x - y;
        System.out.printf("%d - %d = %d\n", x, y, resultado2);

        int resultado3 = x * y;
        System.out.printf("%d * %d = %d\n", x, y, resultado3);

        int resultado4 = x / y;
        System.out.printf("%d / %d = %d\n", x, y, resultado4);

        int resultado5 = x % y;
        System.out.printf("%d %% %d = %d\n", x, y, resultado5);

        // Resto % -> funciona apenas para números inteiros

        // Conversão de tipos
        // - Operandos do mesmo tipo -> resultado do mesmo tipo
        //      int + int       -> int
        //      float - float   -> float
        // - Operandos de tipos diferentes -> resultado do maior tipo

        int v1 = 10;
        long v2 = 20L;
        float v3 = 30.3F;
        double v4 = 40.4;

        v2 = v1 + v2;
        v3 = v3 + v1;

        // Conversão explícita (coerção - type cast)
        v3 = v1 + v3 + (float) v4;

        System.out.println("LIMITES  float: " + Float.MAX_VALUE);
        System.out.println("LIMITES double: " + Double.MAX_VALUE);

    }



}
