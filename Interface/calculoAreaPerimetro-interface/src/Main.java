import calculos.CalculadoraSalaRetangular;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
        System.out.println("Qual a altura do retangulo:");
        double valorAltura = scanner.nextDouble();
        System.out.println("Qual a largura do retangulo:");
        double valorLargura = scanner.nextDouble();
        double area = calculo.getCalcularArea(valorAltura, valorLargura);
        double perimetro = calculo.getCalcularPerimetro(valorAltura, valorLargura);
        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro);
    }
}