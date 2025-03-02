package main.java.list.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double alturaMetros;

    public Pessoa(String nome, int idade, double alturaMetros) {
        this.nome = nome;
        this.idade = idade;
        this.alturaMetros = alturaMetros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAlturaMetros() {
        return alturaMetros;
    }

    public void setAlturaMetros(float alturaMetros) {
        this.alturaMetros = alturaMetros;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturaMetros=" + alturaMetros +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlturaMetros(), p2.getAlturaMetros());
    }
}