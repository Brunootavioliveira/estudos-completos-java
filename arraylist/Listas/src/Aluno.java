public class Aluno {
    private String name;
    private double nota1;

    public Aluno(String name, double nota1) {
        this.name = name;
        this.nota1 = nota1;

    }

    public String getName() {
        return name;
    }

    public double getNota1() {
        return nota1;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name +
                "\nNota: " + nota1;
    }
}
