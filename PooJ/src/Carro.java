public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual;

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int idade() {
        return anoAtual - ano;
    }
}
