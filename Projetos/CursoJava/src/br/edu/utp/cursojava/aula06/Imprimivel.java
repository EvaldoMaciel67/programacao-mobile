package br.edu.utp.cursojava.aula06;

// Convenção de nome de interface é omesmo que o de classes
// Interface estabelece um contrato entre as classes
// - Contem apenas metodos abstratos
// - Todos metodos sao publicos por padrao
// - Se uma classe implementa uma interface ela deve implementar todos
//   os métodos da interface
// - Senão, a classe se torna abstrata.
// Uma classe pode implementar mais de uma interface
public interface Imprimivel {
    void imprime();
}
