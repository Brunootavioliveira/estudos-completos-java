import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produtos1 = new Produto("Geladeira", 2000, 10);
        Produto produtos2 = new Produto("Microondas", 400, 20);


        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produtos1);
        listaProdutos.add(produtos2);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(0));
        System.out.println(listaProdutos);
    }
}