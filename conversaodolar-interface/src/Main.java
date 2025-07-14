import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterMoeda conversao = new ConverterMoeda();
        System.out.println("Quanto em real quer converter para dólar ?");
        conversao.setValorReal(scanner.nextDouble());
        double valorDolar = conversao.getConverterDolarParaReal(conversao.getValorReal());
        System.out.println(valorDolar);
    }
}