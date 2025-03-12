package main.java.set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    private void adicionarContato(String nome, int numero){

    }

    private void exibirContatos(){
        System.out.println(contatos);
    }
}
