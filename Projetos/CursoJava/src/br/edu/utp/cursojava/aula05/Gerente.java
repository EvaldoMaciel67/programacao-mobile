package br.edu.utp.cursojava.aula05;

public class Gerente extends Funcionario {

    public Gerente() {
        super(0, "");
    }

    public Gerente(int matricula, String nome, float salario) {
        super(matricula, nome);
        this.setSalario(salario);
    }

    @Override
    public void aplicarAumento() {
        float novoSalario = getSalario() + getSalario() * 0.1f;
        this.setSalario(novoSalario);
    }
}
