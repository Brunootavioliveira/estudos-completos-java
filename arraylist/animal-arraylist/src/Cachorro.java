public class Cachorro extends Animal{

    public void latir() {
        System.out.println("au,au,au");
    }

    @Override
    public void emitirSom() {
        System.out.println("Esta latindo");
    }

    public void somOriginal() {
        super.emitirSom();
    }
}
