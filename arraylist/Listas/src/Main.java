import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*List<String> alunos = new ArrayList<>();
        int sair = 0;
        while (sair < 5) {
            System.out.println("Digite os alunos: ");
            String aluno = leitura.next();
            alunos.add(aluno);
            sair++;
        }

        System.out.println(alunos);

        System.out.println("********************************");

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os números para somar: ");
            int numero = leitura.nextInt();
            numeros.add(numero);
        }

        int soma = 0;

        //for-each
        for (int n : numeros) {
            soma += n;
        }

        System.out.println(soma);

        System.out.println("************************************");

        List<String> names = new ArrayList<>();

        int continuar = 1;
        while (continuar != 0) {
            System.out.println("Digite os nomes: ");
            String name = leitura.next();
            if (name.equals("fim")) {
                continuar = 0;
            } else {
                names.add(name);
            }
        }

        System.out.println("Digite algum nome, para verificar se está na lista: ");
        String verificar = leitura.next();

        boolean encontrado = false;
        for (String nome : names) {
            if (verificar.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado == true) {
            System.out.println("Nome encontrado");
        } else {
            System.out.println("Nome não encontrado");
        }

        System.out.println("************************************");

        List<String> frutas = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 5 frutas: ");
            String fruta = leitura.next();
            frutas.add(fruta);
        }

        System.out.println("Tire uma frutas da lista");
        System.out.println("0: " + frutas.get(0));
        System.out.println("1: " + frutas.get(1));
        System.out.println("2: " + frutas.get(2));
        System.out.println("3: " + frutas.get(3));
        System.out.println("4: " + frutas.get(4));
        int opcaoFrutas = leitura.nextInt();

        frutas.remove(opcaoFrutas);
        System.out.println(frutas);

        System.out.println("*******************************************");

        List<String> palavras = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 5 palavras: ");
            String palavra = leitura.next();
            palavras.add(palavra);
        }

        Collections.reverse(palavras);
        System.out.println(palavras);

        System.out.println("******************************************");

        List<Integer> num = new ArrayList<>();

        int sairNum = 0;
        while (sairNum != -1) {
            System.out.println("Digite números: (para sair digite -1)");
            int opcaoNum = leitura.nextInt();

            if (opcaoNum == -1) {
                sairNum = -1;
            } else {
                num.add(opcaoNum);
            }
        }

        int numeroRep = 0;
        for (int n : num) {
            if (n == 0) {
                numeroRep++;
            }
        }
        System.out.println(numeroRep);

        System.out.println("**********************************************");

        List<Double> numerosNota = new ArrayList<>();
        int quantidadeNota = 5;
        for (int i = 0; i < quantidadeNota; i++) {
            System.out.println("Digite suas 5 notas: ");
            double notas = leitura.nextDouble();
            numerosNota.add(notas);
        }

        double soma = 0;
        for (double a : numerosNota) {
            soma += a;
        }

        double media = soma/quantidadeNota;
        System.out.println("A média é: " + media);

        System.out.println("**********************************");

        List<Integer> numerosVerificar = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 números: ");
            int numerosUsuario = leitura.nextInt();
            numerosVerificar.add(numerosUsuario);
        }

        int numerosPares = 0;
        for (int par : numerosVerificar) {
            if (par % 2 == 0){
                numerosPares++;
            }
        }

        System.out.println("V3ocê digitou " + numerosPares + " números pares");

        System.out.println("***************************************");

        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite 2 nomes: ");
            String nome1 = leitura.next();
            lista1.add(nome1);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite mais 2 nomes: ");
            String nome2 = leitura.next();
            lista1.add(nome2);
        }
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        List<String> listaFinal = new ArrayList<>();
        listaFinal.addAll(lista1);
        listaFinal.addAll(lista2);

        System.out.println("As duas listas juntas: " + listaFinal); */

        System.out.println("**********************************");

        Aluno aluno1 = new Aluno("Bruno", 6);
        Aluno aluno2 = new Aluno("Julia", 10);
        Aluno aluno3 = new Aluno("Apollo", 7);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for (Aluno a : alunos) {
            if (a.getNota1() >= 7) {
                System.out.println(a);
            }
        }
    }
}