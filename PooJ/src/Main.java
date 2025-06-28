import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Fly me to the moon";
        minhaMusica.artista = "Frank Sinatra";
        minhaMusica.anoLancamento = 2000;
        minhaMusica.avalia(7);
        minhaMusica.avalia(9);
        minhaMusica.avalia(9);

        minhaMusica.fichaTecnica();
        System.out.println(minhaMusica.avaliacao);
        System.out.println(minhaMusica.totalAvaliacao);
        System.out.println(minhaMusica.mediaAvaliacao());

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Porsche";
        meuCarro.ano = 2000;
        meuCarro.cor = "Cinza";
        meuCarro.anoAtual = 2025;

        meuCarro.fichaTecnica();
        System.out.println(meuCarro.idade());

        Aluno meuAluno = new Aluno();
        meuAluno.name = "Bruno";
        meuAluno.age = 19;
        meuAluno.exibirInfo();

        meuAluno.mediaNota(9.2);
        meuAluno.mediaNota(5.1);
        meuAluno.mediaNota(8);
        meuAluno.relacoesNotas();
        System.out.printf("%.2f", meuAluno.mediaBimestre());

    }
}