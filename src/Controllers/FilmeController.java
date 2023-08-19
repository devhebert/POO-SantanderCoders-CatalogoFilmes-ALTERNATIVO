package Controllers;

import Models.Ator;
import Models.Diretor;
import Models.Filme;

import java.util.List;

public class FilmeController {
    public static boolean cadastrarFilme(String nome, String dataLancamento, Double orcamento,
                                         String descricao, Diretor diretor, List<Ator> atores) {
        try {
            if (nome == null || dataLancamento == null || orcamento == null ||
                    descricao == null || diretor == null || atores == null) {
                System.out.println("Por favor, preencha todas as informações solicitadas.");
                return false;
            }

            Filme filme = new Filme(nome, dataLancamento, orcamento, descricao, diretor, atores);
            Models.Filme.cadastrarFilme(filme);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
