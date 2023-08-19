package Repositories;

import Models.Filme;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {
    private static List<Filme> filmes = new ArrayList<>();

    public static Filme salvarFilme(Filme filme) {
        filmes.add(filme);
        return filme;
    }

    public static List<Filme> obterFilmes() {
        return filmes;
    }

    public static List<Filme> pesquisarFilme(String nome) {
        List<Filme> filmesEncontrados = new ArrayList<>();

        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                filmesEncontrados.add(filme);
            }
        }

        return filmesEncontrados;
    }
}
