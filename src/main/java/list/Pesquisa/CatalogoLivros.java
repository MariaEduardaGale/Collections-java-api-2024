package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao ) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        //Criando uma lista de livros
        List<Livro> livrosPorAutor = new ArrayList<>();
        //o método isEmpty() é uma função útil para verificar se uma coleção, como uma lista ou um conjunto, ou uma string está vazia. retornando um valor booleno.
        if(!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }

            }

        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                    //o exercicio pediu para encontrar o primeiro livro, por isso colocou o break para encerrar o laço
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1" , 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2" , 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2" , 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3" , 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4" , 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1994, 2021));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
