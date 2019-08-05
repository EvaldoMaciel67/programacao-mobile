package br.edu.utp.cursojava;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // Operadores lógicos
        //      (booleano) op (booleano) -> (booleano)
        //
        //  !   negação
        //  ||  ou - curto circuito
        //  &&  e  - curto circuito
        //  |   ou
        //  &   e

        boolean b1 = true;
        boolean b2 = false;

        System.out.printf("!%b = %b\n", b1, !b1);
        System.out.printf("!%b = %b\n", b2, !b2);

        System.out.printf("%b && %b = %b\n", b1, b2, b1 && b2);
        System.out.printf("%b && %b = %b\n", b1, b1, b1 && b1);

        System.out.printf("%b || %b = %b\n", b1, b2, b1 || b2);
        System.out.printf("%b || %b = %b\n", b1, b1, b1 || b1);


    }
}
