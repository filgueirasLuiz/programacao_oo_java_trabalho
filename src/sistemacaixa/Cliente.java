package sistemacaixa;

public class Cliente {
    private String codigo, nome, cpfCnpj, dataCadastro;

    public Cliente(String codigo, String nome, String dataCadastro, String cpfCnpj) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

   /*public String getCodigo() {
        return codigo;
    }*/
}
