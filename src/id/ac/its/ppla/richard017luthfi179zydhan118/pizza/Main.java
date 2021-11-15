package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust.*;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new CheeseCrust(), new MozzarellaTopping());

        System.out.println(pizza);
        System.out.printf("Total price: %d\n\n", pizza.pizzaPrice());
        
        Pizza pizza2 = new Pizza(new CheeseCrust(), new MushroomTopping());

        System.out.println(pizza2);
        System.out.printf("Total price: %d\n\n", pizza2.pizzaPrice());

        Pizza pizza3 = new Pizza(new CheeseCrust(), new BeefTopping());

        System.out.println(pizza3);
        System.out.printf("Total price: %d\n\n", pizza3.pizzaPrice());

        Pizza customPizza1 = new Pizza(new CheeseCrust(), new PentolTopping(), new PizzaTopping[]{new SausageTopping()});
        Pizza customPizza2 = new Pizza(new CheeseCrust(), new PentolTopping(), new PizzaTopping[]{
                new BeefTopping(),
                new TunaTopping(),
                new MozzarellaTopping()
        });
        Pizza completePizza = new Pizza(new CheeseCrust(), new MozzarellaTopping(),new PizzaTopping[]{
                new MushroomTopping(),
                new BeefTopping(),
                new ChickenTopping(),
                new PentolTopping(),
                new SausageTopping(),
                new TunaTopping()
        });
        
        System.out.println(customPizza1);
        System.out.printf("Total price: %d\n\n", customPizza1.pizzaPrice());

        System.out.println(customPizza2);
        System.out.printf("Total price: %d\n\n", customPizza2.pizzaPrice());

        System.out.println(completePizza);
        System.out.printf("Total price: %d\n\n", completePizza.pizzaPrice());
    }
}
