import Utils.UtilidadesConsole;
import Views.FilmeView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilidadesConsole.marcadorDeLinha();
        System.out.println("\t\t\t\t\t\t\t\tCATÁLOGO DE FILMES");
        UtilidadesConsole.marcadorDeLinha();

        boolean opcao = true;

        while (opcao) {
            UtilidadesConsole.marcadorDeLinha();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Pesquisar filmes");
            System.out.println("4 - Sair");
            UtilidadesConsole.marcadorDeLinha();

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> FilmeView.cadastrarFilme();
                case 2 -> FilmeView.listarFilmes();
                case 3 -> FilmeView.pesquisarFilmes();
                case 4 -> opcao = false;
                default -> System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        System.out.println("Programa encerrado.");
    }
}