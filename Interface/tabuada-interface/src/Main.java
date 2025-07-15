import calculo.TabuadaMultiplicacao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        System.out.println("Qual número quer saber a tabuada ?");
        int numero= scanner.nextInt();
        tabuada.getMostrarTabuada(numero);
    }
}