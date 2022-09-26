package geekbrains;

public class Cockie extends Product {

    private double weight;

    public Cockie(String name, Double cost, double weight) {
        super(name, cost);
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Cockie{" +
                "weight=" + weight +
                '}';
    }
}
