package main.java.set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    private void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    private void exibirContatos(){
        System.out.println(contatos);
    }

    private Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        for(Contato c: contatos){
            if(c.getNome().equals(nome)){
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    private Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatos){
            if(c.getNome().equals(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Cauan", 995650);
        agendaContatos.adicionarContato("Cauan G", 995654);
        agendaContatos.adicionarContato("Cauan S", 995656);
        agendaContatos.adicionarContato("Cauan C", 995600);
        agendaContatos.adicionarContato("Cauan R", 993466);

        agendaContatos.exibirContatos();


        System.out.println("Atualizado o contato"+ agendaContatos.atualizarNumeroContato("Cauan S", 990000));
        System.out.println(agendaContatos.pesquisarPorNome("Cauan G"));
    }
}
