package geekbrains;
/*
Реализовать абстрактный класс Продукт, добавить ему какие-то параметры.
Реализовать несколько наследников от класса Продукт со своими параметрами, конструкторами и переопределяющие метод toString
Реализовать класс Торговый автомат инициализирующий в дефотлном конструкторе несколько коллекций содержащих наследников класса Продукт
Реализовать несколько методов возвращающих наследника класса(использовать разных наследников) Продукт по какому признаку
В отдельном классе Main, реализовать пример использования торгового автомата (Создать автомат - запросить продукт по критерию
 - вывести полученный продукт в лог)
 */

public class Service {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println(vendingMachine.getProductByName("Twix"));
        System.out.println(vendingMachine.getProductByCost(20));
        System.out.println(vendingMachine.getTeeBottle("Lipton", 5., 1.5));
        System.out.println(vendingMachine.getJuice("Lime", 10., 1.0));

        System.out.println();

        for (Product item : vendingMachine.food) {
            System.out.println(item.getName() + ", " + item + ", price - " + item.getCost());
        }

    }
}
