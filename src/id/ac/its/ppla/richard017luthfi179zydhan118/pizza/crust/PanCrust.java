package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust;

public class PanCrust implements PizzaCrust {
    @Override
    public int getPrice() {
        return 3000;
    }

    @Override
    public String getName() {
        return "Pan";
    }
}
