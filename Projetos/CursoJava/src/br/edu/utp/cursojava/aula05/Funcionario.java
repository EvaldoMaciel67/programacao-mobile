package br.edu.utp.cursojava.aula05;

// Uma classe abstrata é uma classe que possui pelo menos um
// metodo abstrato
//  - metodo abstrato: metodo sem implementacao
// Uma classe abstrata não pode ser instanciada

// Usada quando a classe pai serve apenas como uma generalização
// de outras classes filhas - atributos e métodos em comum

public class Funcionario {

    private String nome;
    private int matricula;
    private long salario;

    public Funcionario(int matricula, String nome) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.salario = 0;
    }

    public void setSalario(float salario) {
        this.salario = (long) (salario * 100);
    }

    public float getSalario() {
        return salario / 100f;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Matricula...: ").append(matricula).append('\n');
        builder.append("Nome........: ").append(nome).append('\n');
        builder.append("Salario.....: ").append(salario/100).append('\n');
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Funcionario outro = (Funcionario) obj;
        return this.matricula == outro.matricula
                && this.nome.equals(outro.nome);
    }

    public void aplicarAumento() {
        // nada
    }



}
