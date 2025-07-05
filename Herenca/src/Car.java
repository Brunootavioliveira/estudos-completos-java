public class Car {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo (String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos (double ano1,double ano2,double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    public double mediaPrecos() {
        return (precoAno1+precoAno2+precoAno3) / 3;

    }

    public void informacoesCar() {
        System.out.println("Carro do modelo: " + modelo);
        System.out.println("Preços 2020: " + precoAno1);
        System.out.println("Preços 2021: " + precoAno2);
        System.out.println("Preços 2022: " + precoAno3);
        System.out.printf("Média dos preços: %.2f\n", mediaPrecos());
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }

    private double menorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double maiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
