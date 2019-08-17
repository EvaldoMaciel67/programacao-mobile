package br.edu.utp.cursojava.aula07;


// Tipos genericos são usados quando queremos parametrizar um
// tipo de dados
// - Toda estrutura e os algoritmos sao os mesmos, e só muda o
// tipo dos dados que sao armazenados
public class Caixa<T> {

    private T coisa;

    public Caixa(T coisa) {
        this.coisa = coisa;
    }

    public void imprime() {
        System.out.println(this.coisa);
    }
    
}
