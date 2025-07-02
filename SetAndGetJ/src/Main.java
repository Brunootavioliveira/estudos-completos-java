import Model.*;

public class Main {
    public static void main(String[] args) {
        ContBank myBank = new ContBank();
        myBank.setNumeroConta(1234);
        myBank.setSaldo(123.40);
        myBank.titular = "Bruno";

        System.out.println("Seu número de conta é" + myBank.getNumeroConta() +" com um de saldo de " + myBank.getSaldo() +" e o titular desta conta é " + myBank.titular);

        System.out.println("----------------------------------------");

        PersonAge person1 = new PersonAge();
        person1.setName("Bruno");
        person1.setIdade(18);

        System.out.println("Senhor " + person1.getName() + " com idade de " + person1.getIdade());
        person1.verificarIdade();

        System.out.println("----------------------------------------");

        Product product1 = new Product();
        product1.setName("Macarrão");
        product1.setPrice(20);

        product1.aplicarDesconto(5);
        System.out.println("Preço descontato é " + product1.getPrice());

        System.out.println("----------------------------------------");

        Student student1 = new Student();
        student1.setName("Julia");
        student1.setNota1(9);
        student1.setNota2(7.2);
        student1.setNota3(8.5);

        System.out.println("Bem vindo " + student1.getName() + "Sua média foi: ");
        System.out.printf("%.2f", student1.calcularMedia());

        System.out.println("----------------------------------------");

        Book book1 = new Book();
        book1.setTitulo("Estrutura de dados");
        book1.setAutor("Bruno");

        book1.exibirDetalhes();
    }
}