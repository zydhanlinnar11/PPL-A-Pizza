package id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings;

public class SausageTopping implements PizzaTopping {
    @Override
    public int getPrice() {
        return 3000;
    }

    @Override
    public String getName() {
        return "Sausage";
    }
}
