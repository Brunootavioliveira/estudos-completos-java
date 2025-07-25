public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Nome: " + this.getName() + " Preço: " + this.getPrice();

    }
}


