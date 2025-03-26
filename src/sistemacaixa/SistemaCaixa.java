package sistemacaixa;

public class SistemaCaixa {
    public static void main(String[] args) {
        Loja loja = new Loja("001", "Supermercado XYZ", "12.345.678/0001-99", "XYZ LTDA", "Rua das Compras, 123");
        Cliente cliente = new Cliente("1001", "Luiz Felipe", "2025-03-24", "123.456.789-00");
        CupomFiscal caixa = new CupomFiscal(loja, cliente);

        Produto item1 = new Produto("A001", "Arroz", 2, 4.49);
        Produto item2 = new Produto("B002", "Feijão", 1, 1.39);
        Produto item3 = new Produto("C003", "Coca-Cola", 6, 8.99);


        caixa.adicionarItem(item1);
        caixa.adicionarItem(item2);
        caixa.adicionarItem(item3);

        caixa.gerarCupomFiscal();
    }
}
