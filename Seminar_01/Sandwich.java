package geekbrains;

public class Sandwich extends Product{
    private double weigt;
    public Sandwich(String name, Double cost, double weight) {
        super(name, cost);
        this.weigt=weight;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "weigt=" + weigt +
                '}';
    }
}
