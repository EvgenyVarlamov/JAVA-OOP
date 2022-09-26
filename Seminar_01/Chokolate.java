package geekbrains;

public class Chokolate extends  Product{
    private double weight;
    public Chokolate(String name, Double cost, double weight) {
        super(name, cost);
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Chokolate{" +
                "weight=" + weight +
                '}';
    }
}
