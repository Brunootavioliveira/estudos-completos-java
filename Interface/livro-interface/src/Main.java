import Models.Livro;
import Models.ProdutoFisico;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProdutoFisico livro1 = new ProdutoFisico();
        livro1.setName("Código Limpo");
        livro1.setStaticPrice(86.42);
        Livro livro1Online = new Livro();
        livro1Online.setName("Código Limpo");
        livro1Online.setStaticPrice(86.42);

        ProdutoFisico livro2 = new ProdutoFisico();
        livro2.setName("O Programador Pragmático");
        livro2.setStaticPrice(174.30);
        Livro livro2Online = new Livro();
        livro2Online.setName("O Programador Pragmático");
        livro2Online.setStaticPrice(174.30);

        ProdutoFisico livro3 = new ProdutoFisico();
        livro3.setName("Use a Cabeça Java");
        livro3.setStaticPrice(109.40);
        Livro livro3Online = new Livro();
        livro3Online.setName("Use a Cabeça Java");
        livro3Online.setStaticPrice(109.40);

        System.out.println(" Qual livro quer consultar o preço: ");
        System.out.println("1: " + livro1.getName());
        System.out.println("2: " + livro2.getName());
        System.out.println("3: " + livro3.getName());
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1 -> {
                livro1.calcularPrecoFinal();
                livro1Online.calcularPrecoFinal();
            }
            case 2 -> {
                livro2.calcularPrecoFinal();
                livro2Online.calcularPrecoFinal();
            }
            case 3 -> {
                livro3.calcularPrecoFinal();
                livro3Online.calcularPrecoFinal();
            }
            default -> System.out.println("Opção inválida");
        }
        scanner.close();
    }
}