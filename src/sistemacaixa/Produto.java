package sistemacaixa;

public class Produto {
    private String codigo, nome;
    private int quantidade;
    private double valor;

    public Produto(String codigo, String nome, int quantidade, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getSubtotal() {
        return quantidade * valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
