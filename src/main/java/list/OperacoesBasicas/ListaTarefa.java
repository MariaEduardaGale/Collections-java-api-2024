package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

     //método de adicionar tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
//        Cria um novo objeto Tarefa com a descrição fornecida e adiciona esse objeto à lista tarefaList.
    }

    //método para remover tarefas pela descrição
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //método para obter o número total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size(); //o método size retona um número inteiro
    }

    //Método para imprimir a descrição das tarefas
    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de descrição na lista de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de descrição na lista de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de descrição na lista de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefa();
    }
}
