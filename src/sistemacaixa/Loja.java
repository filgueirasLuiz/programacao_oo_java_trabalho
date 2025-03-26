package sistemacaixa;

public class Loja {
    private String codigo, nome, cnpj, razaoSocial, endereco;

    public Loja(String codigo, String nome, String cnpj, String razaoSocial, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
}
