//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModeloCarro ferrari = new ModeloCarro("Ferrari", 100000, 200000,150000);
        ModeloCarro ford = new ModeloCarro("ford", 30000, 70000,150000);
        ferrari.informacoesCar();
        ford.informacoesCar();

        System.out.println("----------------------------------");
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("----------------------------------");
        ContaBancaria conta = new ContaBancaria();
        conta.informacoes();
        if(conta.getOpcoes() == 1) {
            System.out.println(conta.depositar());
        } else if (conta.getOpcoes() == 2) {
            System.out.println(conta.sacarSaldo());
        } else if (conta.getOpcoes() == 3){
            conta.consultarSaldo();
        } else {
            System.out.println("Não tem essa opcao");
        }

    }
}