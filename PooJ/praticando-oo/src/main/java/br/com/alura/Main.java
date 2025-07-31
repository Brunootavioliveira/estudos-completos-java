package br.com.alura;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Julia", "Diretora Jornalistica", 100000);
        Funcionario funcionario2 = new Funcionario("Bruno", "Desenvolvedor Senior", 20000);
        Funcionario funcionario3 = new Funcionario("Apollo", "Gerente de Vendas", 90000);

        funcionario1.exibirDados();
        funcionario2.exibirDados();
        funcionario3.exibirDados();
    }
}
