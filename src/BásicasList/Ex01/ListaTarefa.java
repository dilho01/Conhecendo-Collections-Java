package BásicasList.Ex01;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefalist;

    public ListaTarefa(){
        this.tarefalist = new ArrayList<>();
}

public void adicionarTarefa(String descricao){
    tarefalist.add(new Tarefas(descricao));
}

public void  removerTarefa(String descricao){
    List<Tarefas> tarefasparaRemover = new ArrayList<>();
    for(Tarefas t: tarefalist){
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasparaRemover.add(t);
        }
    }
    tarefasparaRemover.removeAll(tarefasparaRemover);
}

public int obterNumerotodalTarefas(){
    return tarefalist.size();
} 
public void obterDescricaoTarefas(){
    System.out.println(tarefalist);
}
public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

      listaTarefa.adicionarTarefa("tarefa 1");
      listaTarefa.adicionarTarefa("tarefa 1"); 
     listaTarefa.adicionarTarefa("tarefa 2");



    System.out.println("O numero total dr elementos na lista e : " + listaTarefa.obterNumerotodalTarefas());

     listaTarefa.removerTarefa("tarefa 2");
     System.out.println("O numero de tarefas e : " + listaTarefa.obterNumerotodalTarefas());

     listaTarefa.obterDescricaoTarefas();


  
}
}
