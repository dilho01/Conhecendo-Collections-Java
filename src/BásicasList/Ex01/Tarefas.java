package BásicasList.Ex01;

public class Tarefas {
    private String descricao;

    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString(){
        return "Tarefa{" + "descricao" + descricao + '\'' + '}';
    }

}
