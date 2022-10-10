package br.unifei.imc.pagamento;

import br.unifei.imc.produto.Produto;

import java.util.List;

public class CartaoCredito implements Pagamento{
    private double preco;
    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(p-> preco += p.getPreco());

        return preco*1.02;
    }
}
