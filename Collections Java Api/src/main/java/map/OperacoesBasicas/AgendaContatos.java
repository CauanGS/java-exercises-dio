package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    private void adicionarContato(String nome, int numero){
        contatos.put(nome, numero);
    }

    private void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    private void exibirContatos(){
        System.out.println(contatos);
    }

    private Integer pesquisarPorNome(String nome){
        Integer numeroTelefone = null;
        if(!contatos.isEmpty()){
            numeroTelefone = contatos.get(nome);
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Cauan", 995650);
        agendaContatos.adicionarContato("Cauan G", 995654);
        agendaContatos.adicionarContato("Cauan S", 995656);
        agendaContatos.adicionarContato("Cauan C", 995600);
        agendaContatos.adicionarContato("Cauan R", 993466);

        agendaContatos.exibirContatos();


        System.out.println(agendaContatos.pesquisarPorNome("Cauan G"));
    }
}
