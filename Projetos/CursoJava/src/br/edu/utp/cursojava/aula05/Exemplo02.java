package br.edu.utp.cursojava.aula05;

public class Exemplo02 {
    
    public static void main(String[] args){
        Gerente g1 = new Gerente(1, "Joao", 5000);
        Programador p1 = new Programador(2, "Pedro", 2000);
        
        System.out.println(g1);
        System.out.println(p1);

        g1.aplicarAumento();
        p1.aplicarAumento();

        System.out.println(g1);
        System.out.println(p1);
    }
    
}
