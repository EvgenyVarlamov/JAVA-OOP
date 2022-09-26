package geekbrains;

public class Juice extends Product{

    private double volume;

    public Juice(String name, Double cost, double volume) {
        super(name, cost);
        this.volume=volume;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "volume=" + volume +
                '}';
    }
}
