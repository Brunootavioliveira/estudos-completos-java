import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Galinha");
        animais.forEach(animal -> System.out.println(animal));

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        animal.emitirSom();
        if (animal instanceof Cachorro) {
            Cachorro cachorro1 = (Cachorro) animal;
            cachorro1.latir();
            cachorro1.somOriginal();
        }
    }
}