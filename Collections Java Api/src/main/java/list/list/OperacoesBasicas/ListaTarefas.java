package main.java.list.list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    static List<Tarefa> lista= new ArrayList<>();

    public ListaTarefas() {
    }

    public void adicionarTarefa(String descricao){
        Tarefa novaTarefa = new Tarefa(descricao);
        lista.add(novaTarefa);
        // ou tambem: lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        lista.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalTarefas(){
        return lista.size();
    }

    public void obterDescricaoTarefas(){
        for(Tarefa t : lista){
            System.out.println(t.getDescricao()+"\n");
        }
        // ou tambem: System.out.println(lista) (toString);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("O numero de tarefas atual e: " + listaTarefa.obterNumeroTotalTarefas() );

        listaTarefa.adicionarTarefa("T1");
        listaTarefa.adicionarTarefa("T2");
        listaTarefa.adicionarTarefa("T2");
        System.out.println("O numero de tarefas atual e: " + listaTarefa.obterNumeroTotalTarefas() );

        listaTarefa.removerTarefa("T2");
        System.out.println("O numero de tarefas atual e: " + listaTarefa.obterNumeroTotalTarefas() );

        listaTarefa.obterDescricaoTarefas();

    }
}
