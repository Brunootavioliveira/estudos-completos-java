public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int totalAvaliacao;

    void fichaTecnica() {
        System.out.println("Nome da Musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano lançado: " + anoLancamento);

    }

    void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacao() {
        return avaliacao / totalAvaliacao;
    }
}
