package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProduto.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque(){
        double valorEstoque = 0d;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                valorEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = new Produto("", -1,Double.MIN_VALUE);
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                if((p.getPreco() * p.getQuantidade()) > (produtoMaiorQuantidade.getPreco() * produtoMaiorQuantidade.getQuantidade())){
                    produtoMaiorQuantidade = p;
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();


        estoque.adicionarProduto(1L, "Produto A", 10, 5.0d);
        estoque.adicionarProduto(2L, "Produto B", 5, 9.0d);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0d);
        estoque.adicionarProduto(8L, "Produto D", 2, 20.0d);


        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
