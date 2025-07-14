package calculos;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double getCalcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double getCalcularPerimetro(double altura, double largura) {
        return (altura + largura) * 2;
    }
}
