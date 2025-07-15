import java.util.Scanner;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    public void escolha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Escolha:
                1: Celsius para Fahrenheit
                2: Fahrenheit para Celsius
                """);
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            double tempCelsius = scanner.nextDouble();
            double resultado = celsiusParaFahrenheit(tempCelsius);
            System.out.println(resultado);
        } else if (opcao == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            double tempFahrenheit = scanner.nextDouble();
            double resultado = fahrenheitParaCelsius(tempFahrenheit);
            System.out.println(resultado);
        } else {
            System.out.printf("Opção invalida");
        }
        scanner.close();
    }

    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 5 / 9;
    }
}
