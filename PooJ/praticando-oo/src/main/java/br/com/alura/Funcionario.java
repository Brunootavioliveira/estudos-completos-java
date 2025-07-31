package br.com.alura;

public class Funcionario {
    private String name;
    private String cargo;
    private double salario;

    public Funcionario(String name, String cargo, double salario) {
        this.name = name;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("\n");
        System.out.printf("Nome: %s \nCargo: %s \nSalário: %.2f", this.name,this.cargo,this.salario);
    }
}
