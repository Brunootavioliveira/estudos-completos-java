import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Title titulo1 = new Title("Bruno", 19);
        Title titulo2 = new Title("Julia", 17);
        Title titulo3 = new Title("Daiane", 18);

        ArrayList<Title> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);

        Collections.sort(titulos);
        System.out.println(titulos);
        titulos.sort(Comparator.comparing(Title::getAge));
        System.out.println(titulos);
    }
}