package Models;

import Calculo.Calculavel;

public class Livro implements Calculavel {
    private String name;
    private double staticPrice;
    private double taxaServico;
    private double taxaLivroFisico;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStaticPrice() {
        return staticPrice;
    }

    public void setStaticPrice(double staticPrice) {
        this.staticPrice = staticPrice;
        definirTaxas();
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getTaxaLivroFisico() {
        return taxaLivroFisico;
    }

    public void setTaxaLivroFisico(double taxaLivroFisico) {
        this.taxaLivroFisico = taxaLivroFisico;
    }

    private void definirTaxas() {
        if (staticPrice <= 50) {
            taxaServico = 1.2;
            taxaLivroFisico = 1.4;
        } else if (staticPrice <= 199.99) {
            taxaServico = 1.1;
            taxaLivroFisico = 1.2;
        } else {
            taxaServico = 1.0;
            taxaLivroFisico = 1.1;
        }
    }


    @Override
    public void calcularPrecoFinal() {
        double precoLivroOnline = staticPrice * taxaServico;
        System.out.println("Preço livro online: " + precoLivroOnline);
    }
}
