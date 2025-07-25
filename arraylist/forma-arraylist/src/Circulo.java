public class Circulo implements Forma {

    double raio;

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raioCalculado();
    }

    public double raioCalculado() {
        return raio + raio;
    }

    @Override
    public String toString() {
        return String.format("Raio: %2.f", raio);
    }
}
