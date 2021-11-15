package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class TunaTopping implements PizzaTopping {
    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public String getName() {
        return "Tuna";
    }
}
