package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Produto 01", 43d, 6);
        cadastroProdutos.adicionarProduto(3, "Produto 02", 34d, 5);
        cadastroProdutos.adicionarProduto(6, "Produto 03", 12d, 1);
        cadastroProdutos.adicionarProduto(4, "Produto 04", 22d, 13);
        cadastroProdutos.adicionarProduto(3, "Produto 05", 11d, 2);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        
    }
}

