package Models;

import Repositories.CatalogoFilmes;

import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private Double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;


    public Filme(String nome, String dataLancamento, Double orcamento, String descricao, Diretor diretor, List<Ator> atores) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public static Filme cadastrarFilme(Filme filme) {
        return CatalogoFilmes.salvarFilme(filme);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return
                "----------------------------------------------------------------------------------------- \n" +
                "Nome: " + nome + "\n" +
                "Data de lancamento: " + dataLancamento + "\n" +
                "Orcamento: " + orcamento + "\n" +
                "Descricao: " + descricao + "\n" +
                "Diretor: " + diretor + "\n" +
                "Atore(s): " + atores + "\n" +
                "-----------------------------------------------------------------------------------------";
    }
}
