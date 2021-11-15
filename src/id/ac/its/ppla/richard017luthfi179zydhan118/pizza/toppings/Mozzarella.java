package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class Mozzarella implements PizzaTopping {
    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String toString() {
        return "Mozzarella";
    }
}
