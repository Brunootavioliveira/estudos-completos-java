public class ConverterMoeda implements ConversaoFinanceira {
    private double valorReal;
    private double valorTaxa = 5.00;

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    @Override
    public double getConverterDolarParaReal(double valorReal) {
        return valorReal * valorTaxa;
    }
}
