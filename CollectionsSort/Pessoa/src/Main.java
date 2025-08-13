import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Bruno", 19);
        Pessoa pessoa2 = new Pessoa("Jorginho", 2);
        Pessoa pessoa3 = new Pessoa("Cleitin", 30);

        Map<Integer, Pessoa> List = new HashMap<>();
        List.put(1, pessoa1);
        List.put(2, pessoa2);
        List.put(3, pessoa3);

        System.out.println(List.get(3));
        System.out.println(List.get(2));
    }
}