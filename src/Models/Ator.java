package Models;

public class Ator extends Pessoa {
    public Ator(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    public Ator(String nome) {
        super(nome);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }
}

