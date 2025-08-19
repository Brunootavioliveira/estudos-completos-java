public class PersonTest {
    public static void main(String[] args) {

        try {
            Person person = new Person("Bruno", 13, "Masculino", 123456789);
            person.cadastrar();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("(Erro IllegalArgumentException) " + e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("(Erro RuntimeException) " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("(Erro Exception) " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
