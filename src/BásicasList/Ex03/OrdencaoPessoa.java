package BásicasList.Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdencaoPessoa(){
        this.pessoasList = new ArrayList<>();
    }
    public void adicionnarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoIdade(){
        List<Pessoa> pessoasIdaede = new ArrayList<>(pessoasList);
        Collections.sort(pessoasIdaede);
        return pessoasIdaede;
    }

    public static void main(String[] args) {
        OrdencaoPessoa ordenacaoPessoa = new OrdencaoPessoa();
        ordenacaoPessoa.adicionnarPessoa("nome1", 21, 2.2);
        ordenacaoPessoa.adicionnarPessoa("nome2", 30, 1.9);
        ordenacaoPessoa.adicionnarPessoa("nome3", 10, 1.6);
         ordenacaoPessoa.adicionnarPessoa("nome4", 1, 1.8);
         ordenacaoPessoa.adicionnarPessoa("nome5", 11, 1.6);

         System.out.println(ordenacaoPessoa.ordenadoIdade());

    }

}
