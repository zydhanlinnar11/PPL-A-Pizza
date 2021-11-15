package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class MozzarellaTopping implements PizzaTopping {
    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getName() {
        return "Mozzarella";
    }
}
