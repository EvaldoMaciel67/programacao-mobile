package br.edu.utp.cursojava.aula04;

public class Produto {

    // ---------------------------------------------------------------
    // ATRIBUTOS
    // ---------------------------------------------------------------

    // Para declarar os atributos - define o tipo de acesso + declaração
    //  - privado (private)     - só os objetos da classe tem acesso
    //  - protegido (protected) - só os objetos da classe e classes
    //                          derivadas tem acesso (herança)
    //  - público (public)      - todos tem acesso (NUNCA USADO PARA
    //                          ATRIBUTOS)
    //  - default ()            - só os objetos da classe e do pacote
    //                          tem acesso (NUNCA USADO PARA ATRIBUTOS)

    private int codigo;
    private String nome;
    private String descricao;
    private long preco;
    private int quantidade;

    // CONSTRUTORES

    /**
     * Construtor default: Não recebe parâmetros.
     *  - Se a classe não tiver construtor, o compilador cria o
     *  construtor default
     *  - Serve para inicializar os atributos.
     */
    public Produto() {
        codigo = 0;
//        nome = "";
        descricao = "";
        preco = 0;
        quantidade = 0;
    }

    /**
     * Construtor com inicialização.
     */
    public Produto(int codigo, String nome, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = (long) preco * 100;
    }

    // METODOS

    // Métodos ACESSORES: acessa o valor de um atributo (GETTER)
    // Métodos MUTANTES: altera o valor de um atributo (SETTER)
    // Métodos GERAIS: realizam cálculos, processos, etc

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco / 100.0f;
    }

    public void setPreco(float preco) {
        this.preco = (long) preco * 100;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprime() {
        System.out.println("** PRODUTO **");
        System.out.printf("- codigo......: %d\n", codigo);
        System.out.printf("- nome........: %s\n", nome);
        System.out.printf("- preco.......: %.2f\n", getPreco());
        System.out.printf("- qtde........: %d\n", quantidade);
    }

    public float getTotal() {
        return preco * quantidade / 100.0f;
    }
}









