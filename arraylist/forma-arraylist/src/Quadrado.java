public class Quadrado implements Forma{

    int lado;


    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Lado Quadrado: " + lado;
    }
}
