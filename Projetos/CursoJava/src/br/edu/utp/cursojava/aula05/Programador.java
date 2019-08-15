package br.edu.utp.cursojava.aula05;

public class Programador extends Funcionario {

    public Programador(int matricula, String nome, float salario) {
        super(matricula, nome);
        setSalario(salario);
    }

    @Override
    public void aplicarAumento() {
        float novoSalario = getSalario() + getSalario() * 0.05f;
        this.setSalario(novoSalario);
    }
}
