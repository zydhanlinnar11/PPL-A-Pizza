package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust;

public class CheeseCrust implements PizzaCrust {
    @Override
    public int getPrice() {
        return 6000;
    }

    @Override
    public String getName() {
        return "Cheese";
    }
}
