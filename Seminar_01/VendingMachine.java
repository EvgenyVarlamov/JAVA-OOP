package geekbrains;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> food = new ArrayList<>();

    public VendingMachine() {
        food.add(new TeeBottle("Lipton", 69.99, 1.45));
        food.add(new TeeBottle("Green", 59.99, 1.5));
        food.add(new Juice("Dobry", 50., 2.0));
        food.add(new Juice("Apple", 24.99, 1.0));
        food.add(new Cockie("Oreo", 20., 18.75));
        food.add(new Cockie("Yubileinye", 19.99, 40.));
        food.add(new Chokolate("Shickers", 60.99, 68.7));
        food.add(new Chokolate("Bounty", 45., 54.2));
        food.add(new Chokolate("Twix", 48.01, 40.));
        food.add(new Sandwich("Vkusho  i tochka", 200., 300.));
        food.add(new Sandwich("Burger king", 199., 299.99));
    }


    public Product getProductByName(String name) {

        for (Product item : food) {
            if (item.getName().equals(name)) {
                return item;
            }

        }
        return null;
    }

    public Product getProductByCost(double cost) {
        for (Product item : food) {
            if (item.getCost().equals(cost)) {
                return item;
            }

        }
        return null;
    }


    public TeeBottle getTeeBottle(String name, double cost, double volume) {
        return new TeeBottle(name, cost, volume);
    }

    public Juice getJuice(String name, double cost, double volume) {
        return new Juice(name, cost, volume);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "food=" + food +
                '}';
    }
}