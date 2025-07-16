package Models;

import Calculo.Calculavel;

public class ProdutoFisico extends Livro implements Calculavel {

    @Override
    public void calcularPrecoFinal() {
        double precoLivroPresencial = getStaticPrice() * getTaxaLivroFisico();
        System.out.println("Preço livro fisico: " + precoLivroPresencial);
    }
}
