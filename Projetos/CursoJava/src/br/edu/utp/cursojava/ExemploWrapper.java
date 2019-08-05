package br.edu.utp.cursojava;

public class ExemploWrapper {

    public static void main(String[] args){
        System.out.println("Limites das variáveis: ");
        System.out.println("- Inteiros");
        System.out.printf("byte.....: %d -> %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short....: %d -> %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int......: %d -> %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long.....: %d -> %d\n", Long.MIN_VALUE, Long.MAX_VALUE);

        int x = Integer.parseInt("9000");
        float y = Float.parseFloat("5.6");
        x++;
        y++;
        System.out.println("Valor x: " + x);
        System.out.println("Valor y: " + y);

    }
}
