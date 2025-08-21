package br.com.bruno;

public class PessoaRepository {
    //DEVOLVE UMA PESSOA
    public Pessoa list() {
        return new Pessoa(1111, "Bruno", "12345678901");
    }
}
