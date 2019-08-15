package br.edu.utp.cursojava.aula05;

public class Exemplo01 {

    public static void main(String[] args){
//        Funcionario f1 = new Funcionario(1, "Joao");
//        Funcionario f2 = new Funcionario(2, "Maria");
        Funcionario f3 = new Funcionario(3, "Pedro");
        Funcionario f4 = new Funcionario(3, "Pedro");
        Funcionario f5 = f4;

        if (f3 == f4) {
            System.out.println("f3 == f4");
        } else {
            System.out.println("f3 != f4");
        }

        if (f4 == f5) {
            System.out.println("f4 == f5");
        } else {
            System.out.println("f4 != f5");
        }

        if (f3.equals(f4)) {
            System.out.println("f3 equals f4");
        } else {
            System.out.println("f3 !equals f4");
        }

        if (f4.equals(f5)) {
            System.out.println("f4 equals f5");
        } else {
            System.out.println("f4 !equals f5");
        }

//        System.out.println(f1);
//        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
    }
}
