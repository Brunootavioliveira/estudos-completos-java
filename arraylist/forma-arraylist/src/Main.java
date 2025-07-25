import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;
        Circulo circulo2 = new Circulo();
        circulo2.raio = 10;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 10;
        Quadrado quadrado2 = new Quadrado();
        quadrado2.lado = 15;


        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(circulo2);
        formas.add(quadrado);
        formas.add(quadrado2);

        for (Forma items: formas) {
            System.out.printf("Área: %.2f%n", items.calcularArea());
        }
    }
}