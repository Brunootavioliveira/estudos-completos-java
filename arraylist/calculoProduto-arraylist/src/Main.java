import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produtos1 = new Produto("Geladeira", 802.04);
        Produto produtos2 = new Produto("Microondas", 399.04);
        Produto produtos3 = new Produto("Ps5", 1300.80);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produtos1);
        produtos.add(produtos2);
        produtos.add(produtos3);

        double soma = 0;

        for (Produto item: produtos) {
            soma += item.getPrice();
            System.out.println(item);
        }
        System.out.println(soma);
    }
}