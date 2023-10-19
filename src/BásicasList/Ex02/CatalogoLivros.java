package BásicasList.Ex02;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrolist;

    public CatalogoLivros(){ this.livrolist = new ArrayList<>();}
    public void adicimarLista(String titulo, String autor, String string){
        livrolist.add(new Livro(titulo, autor, string));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l: livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }

        }
        return livrosAutor;
    }

        public List<Livro> pesquisarInteraloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l: livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAnos.add(l);
                }
            }
        }
        return livrosIntervaloAnos;
    }

    public Livro pesquisarTitulo(String tiutlo){
        Livro livroTitulo = null;
        if(!livroTitulo.isEmpty()){
            for(Livro l: livrolist){
                if(l.getTitulo().equalsIgnoreCase((tiutlo))){
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo; 
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicimarLista("livor1", "autor1", "2020");
        catalogoLivros.adicimarLista("livor1", "autor2", "2021");
        catalogoLivros.adicimarLista("livor2", "autor2", "2022");
         catalogoLivros.adicimarLista("livor3", "autor3", "2023");
        catalogoLivros.adicimarLista("livor4", "autor4", "1994");

        System.out.println(catalogoLivros.pesquisarAutor("autor2"));

    }
}

