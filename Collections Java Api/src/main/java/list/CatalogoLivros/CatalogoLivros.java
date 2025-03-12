package main.java.list.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaLivrosEncontrados = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getAutor().equals(autor)){
                    listaLivrosEncontrados.add(l);
                }
            }
        }
        return listaLivrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivrosEncontrados = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if ((l.getAnoDePublicacao() >= anoInicial) && (l.getAnoDePublicacao() <= anoFinal)) {
                    listaLivrosEncontrados.add(l);
                }
            }
        }
        return listaLivrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equals(titulo)) {
                    livroEncontrado = l;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        Livro l1 = new Livro("Livro 1", "Autor 1", 2020);
        Livro l2 = new Livro("Livro 1", "Autor 2", 2021);
        Livro l3 = new Livro("Livro 2", "Autor 2", 2022);
        Livro l4 = new Livro("Livro 3", "Autor 3", 2023);
        Livro l5 = new Livro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro(l1);
        catalogoLivros.adicionarLivro(l2);
        catalogoLivros.adicionarLivro(l3);
        catalogoLivros.adicionarLivro(l4);
        catalogoLivros.adicionarLivro(l5);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
