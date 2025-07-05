import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double depositar;
    private double sacar;
    private int opcoes;
    private final Scanner scanner = new Scanner(System.in);

    public void informacoes(){
        System.out.println("Qual seu saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("""
                            Digite 1: Depositar
                            Digite 2: Sacar
                            Digite 3: Consultar saldo
                            """);
        opcoes = scanner.nextInt();
    }

    public int getOpcoes() {
        return opcoes;
    }

    public double depositar() {
            System.out.println("Quanto quer depositar ? ");
            depositar = scanner.nextDouble();
            return saldo + depositar;
    }

        public double sacarSaldo() {
            System.out.println("Quanto quer sacar ? ");
            sacar = scanner.nextDouble();
            System.out.println("Agora seu saldo é de: ");
            return saldo - sacar;
        }

        public void consultarSaldo() {
            System.out.println("Saldo de: " + saldo);
        }
}
