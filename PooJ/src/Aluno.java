public class Aluno {
    String name;
    int age;
    int totalNota;
    double somaNotas;

    void exibirInfo() {
        System.out.println("Nome aluno: " + name);
        System.out.println("Idade aluno: " + age);
    }

    void mediaNota(double nota) {
        somaNotas += nota;
        totalNota++;
    }

    double mediaBimestre() {
        return somaNotas / totalNota;
    }

    void relacoesNotas() {
        System.out.println(totalNota);
        System.out.println(somaNotas);
    }

}
