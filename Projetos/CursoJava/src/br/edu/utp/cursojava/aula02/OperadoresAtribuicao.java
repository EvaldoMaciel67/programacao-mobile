package br.edu.utp.cursojava.aula02;

public class OperadoresAtribuicao {

    public static void main(String[] args){
        // Operadores de atribuição
        //      (var) = (expressao || valor)

        int x = 10;

        //  +=      x = x + (valor)
        //  -=      x = x - (valor)
        //  *=      x = x * (valor)
        //  /=      x = x / (valor)
        //  %=      x = x % (valor)

        x += 20;
        System.out.println(x);

        x -= 2;
        System.out.println(x);

        x *= 100;
        System.out.println(x);

        // Pré/Pós - incremento ++
        // Pré/Pós - decremento --
        // Pela convenção Java, devemos evitar o uso no meio de expressões
        // para facilitar a legibilidade do código
        ++x;
        x++;

        int y = x;
        x++;



    }
}
