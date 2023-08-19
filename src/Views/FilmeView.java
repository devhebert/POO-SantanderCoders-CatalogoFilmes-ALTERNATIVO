package Views;

import Controllers.FilmeController;
import Models.Ator;
import Models.Diretor;
import Models.Filme;
import Repositories.CatalogoFilmes;
import Utils.UtilidadesConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmeView {
    public static void cadastrarFilme() {
        UtilidadesConsole.marcadorDeLinha();
        String input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        input = sc.nextLine();
        String nome = input;

        System.out.println("Digite a data de lançamento:");
        input = sc.nextLine();
        String dataLancamento = input;

        System.out.println("Digite o orçamento:");
        input = sc.nextLine();
        Double orcamento = Double.parseDouble(input);

        System.out.println("Digite a descricao:");
        input = sc.nextLine();
        String descricao = input;

        System.out.println("Digite o nome do diretor:");
        input = sc.nextLine();
        Diretor diretor = new Diretor(input);

        System.out.println("Informe o(s) ator(es), separados por vírgula:");
        input = sc.nextLine();
        String[] atoresArray = input.split(",");
        List<Ator> atores = new ArrayList<>();

        for (String ator : atoresArray) {
            Ator novoAtor = new Ator(ator.trim());
            atores.add(novoAtor);
        }

        if (FilmeController.cadastrarFilme(nome, dataLancamento, orcamento, descricao, diretor, atores)) {
            System.out.println("Filme cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao criar filme!");
        }
    }

    public static void listarFilmes() {
        UtilidadesConsole.marcadorDeLinha();
        List<Filme> filmes = CatalogoFilmes.obterFilmes();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        UtilidadesConsole.marcadorDeLinha();
    }

    public static void pesquisarFilmes() {
        UtilidadesConsole.marcadorDeLinha();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome que deseja buscar:");
        String nome = sc.nextLine();

        List<Filme> filmesEncontrados = CatalogoFilmes.pesquisarFilme(nome);

        if (filmesEncontrados.isEmpty()) {
            System.out.println("Nenhum filme encontrado com o nome: " + nome);
        } else {
            System.out.println("Filmes encontrados:");
            for (Filme filme : filmesEncontrados) {
                System.out.println(filme);
            }
        }

        UtilidadesConsole.marcadorDeLinha();
    }
}
