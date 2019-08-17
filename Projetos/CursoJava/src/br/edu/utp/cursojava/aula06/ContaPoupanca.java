package br.edu.utp.cursojava.aula06;

public class ContaPoupanca extends Conta {

    // Declaração de constantes em Java:
    // - static: variável pertence a classe - compartilhada por todos os objetos
    // - final: valor da variável não pode ser alterado
    // - nome em maiusculo separado por _
    private static final float JUROS_DIARIOS = 0.05f;

    public ContaPoupanca(final int numero, final int agencia, final String cliente) {
        super(numero, agencia, cliente);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Valor do juros é um número mágico
        // - Não se conhece o contexto do número
        // - Dificultam o entendimento do codigo
        // Para facilitar a leitura, externaliza o valor para uma variavel
        float acrescimo = getSaldo() * JUROS_DIARIOS;
        depositar(acrescimo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** CONTA POUPANÇA ***");
        super.imprimirExtrato();
    }

}
