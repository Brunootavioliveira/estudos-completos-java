package calculo;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void getMostrarTabuada(int numero) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + "X" + i + "=" +(numero*i));
        }
    }
}
