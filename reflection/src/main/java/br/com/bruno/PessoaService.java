package br.com.bruno;

public class PessoaService {
    //metodo para transformar o objeto em DTO
    public PessoaDTO list() {
        Pessoa pessoa = new PessoaRepository().list();
        PessoaDTO pessoaDTO = new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
        return pessoaDTO;
        //Chamar para pegar a pessoa que esta no banco de dados
    }
}
