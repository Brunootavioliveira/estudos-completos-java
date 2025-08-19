public class Person {
    private String name;
    private int idade;
    private String sexo;
    private int cpf;

    public Person(String name, int idade, String sexo, int cpf) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public void cadastrar() throws Exception {
        if(idade < 18) {
            throw new Exception("Idade deve ser maior que 18 anos");
        } else {
            System.out.println("Cadastro feito com sucesso");
        }
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCpf() {
        return cpf;
    }
}
