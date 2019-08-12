package br.edu.utp.cursojava.aula04;

public class GerenciadorEstoque {

    public static void main(String[] args){

        Produto p1 = new Produto();
        System.out.println(p1);
        p1.imprime();

        p1.setCodigo(123);
        p1.setNome("PS3");
        p1.setPreco(1999.99f);
        p1.setQuantidade(2);
        p1.imprime();

        System.out.println("TOTAL: " + p1.getTotal());

        Produto p2 = new Produto(456, "PS4", 2999.99f);
        System.out.println(p2);
        p2.setQuantidade(2);
        p2.imprime();

        System.out.println("TOTAL: " + p2.getTotal());

        Produto p3 = null;
        System.out.println(p3);
        p3 = p1;
        p3.setNome("PS5");

        p1.imprime();


    }

}
