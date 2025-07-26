import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean perguntas = true ;

        ArrayList<String> listaCompras = new ArrayList<>();

        while (perguntas) {
            System.out.println("Qual produto quer comprar ?");
            String compra = scanner.nextLine();
            listaCompras.add(compra);

            System.out.println("Quer comprar mais ? n/s");
            String escolha = scanner.nextLine();
            if (escolha.equals("n")) {
                Collections.sort(listaCompras);
                System.out.println(listaCompras);
                perguntas = false;
            }
        }
    }
}