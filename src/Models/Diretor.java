package Models;

public class Diretor extends Pessoa {
    public Diretor(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    public Diretor(String nome) {
        super(nome);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }
}
