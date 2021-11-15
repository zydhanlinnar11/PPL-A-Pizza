package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class ChickenTopping implements PizzaTopping {
    @Override
    public int getPrice() {
        return 6000;
    }

    @Override
    public String getName() {
        return "Chicken";
    }
}
