package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class BeefTopping implements PizzaTopping {
    @Override
    public int getPrice() {
        return 7000;
    }

    @Override
    public String getName() {
        return "Beef";
    }
}
