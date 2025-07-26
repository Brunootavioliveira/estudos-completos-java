import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ordenarNumero = new ArrayList<>();
        ordenarNumero.add(5);
        ordenarNumero.add(4);
        ordenarNumero.add(7);
        ordenarNumero.add(9);
        Collections.sort(ordenarNumero);
        System.out.println(ordenarNumero);
    }
}