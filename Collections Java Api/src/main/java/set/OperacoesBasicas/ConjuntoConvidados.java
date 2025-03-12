package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        for(Convidado c: convidados){
            System.out.println(convidados);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados setConvidados = new ConjuntoConvidados();
        System.out.println("Atualmente existem "+ setConvidados.contarConvidados()+" convidados dentro da lista de convidados!");

        setConvidados.adicionarConvidado("Convidado 0", 7756);
        setConvidados.adicionarConvidado("Convidado 1", 7765);
        setConvidados.adicionarConvidado("Convidado 2", 7743);
        setConvidados.adicionarConvidado("Convidado 3", 7734);

        System.out.println("Atualmente existem "+ setConvidados.contarConvidados()+" convidados dentro da lista de convidados!");

        setConvidados.removerConvidadoPorCodigoConvite(7765);
        System.out.println("Atualmente existem "+ setConvidados.contarConvidados()+" convidados dentro da lista de convidados!");
    }
}
