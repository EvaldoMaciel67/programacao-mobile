package br.edu.utp.cursojava.aula06;

public class ContaCorrente extends Conta {

    private static final float JUROS_DIARIOS = 0.01f;

    public ContaCorrente(int numero, int agencia, String cliente) {
        super(numero, agencia, cliente);
    }

    @Override
    public void aplicarJurosDiarios() {
        float acrescimo = getSaldo() * JUROS_DIARIOS;
        depositar(acrescimo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** CONTA CORRENTE ***");
        super.imprimirExtrato();
    }

    public void solicitarCheque() {
        System.out.println("Solicitando cheques para o cliente...");
    }
    
    
}
