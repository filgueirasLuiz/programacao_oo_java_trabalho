package sistemacaixa;

import java.util.ArrayList;
import java.util.List;

public class CupomFiscal {
    private Loja loja;
    private Cliente cliente;
    private List<Produto> itens;

    public CupomFiscal(Loja loja, Cliente cliente) {
        this.loja = loja;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto item) {
        itens.add(item);
    }

    public int totalItens() {
        return itens.stream().mapToInt(Produto::getQuantidade).sum();
    }

    public double totalValor() {
        return itens.stream().mapToDouble(Produto::getSubtotal).sum();
    }

    public void gerarCupomFiscal() {
        System.out.println("Loja: " + loja.getNome() + " (" + loja.getCnpj() + ")");
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Cliente: " + cliente.getNome()  + " (" + cliente.getCpfCnpj() + ")\\n");
        System.out.println("Itens Comprados:");
        System.out.println("Codigo | Nome | Quantidade | Valor | Subtotal");
        for (Produto item : itens) {
            System.out.printf("%s | %s | %d | R$%.2f | R$%.2f%n",
                    item.getCodigo(), item.getNome(), item.getQuantidade(),
                    item.getValor(), item.getSubtotal());
        }
        System.out.println("\\nResumo da Compra:");
        System.out.println("Total de Itens: " + totalItens());
        System.out.printf("Valor Total: R$%.2f%n", totalValor());
    }
}
