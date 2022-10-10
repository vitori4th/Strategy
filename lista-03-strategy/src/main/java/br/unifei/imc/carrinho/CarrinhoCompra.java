package br.unifei.imc.carrinho;

import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.pagamento.Pagamento;
import br.unifei.imc.produto.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CarrinhoCompra {
    
    List<Produto> produtos;
    private double precoTotal;
    @Setter
    private Pagamento tipoPagamento;

    public CarrinhoCompra(){
        produtos = new ArrayList<>();
        tipoPagamento = new Boleto();
    }
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void calcularPreco() {
        precoTotal = tipoPagamento.calcularPreco(produtos);
    }
}
