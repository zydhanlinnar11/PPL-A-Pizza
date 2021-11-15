package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust.CheeseCrust;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.MozzarellaTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.MushroomTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.BeefTopping;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new MozzarellaTopping(), new CheeseCrust());

        System.out.println(pizza);
        System.out.println(pizza.pizzaPrice());
        
        Pizza pizza2 = new Pizza(new MushroomTopping(), new CheeseCrust());

        System.out.println(pizza2);
        System.out.println(pizza2.pizzaPrice());
        
        Pizza pizza3 = new Pizza(new BeefTopping(), new CheeseCrust());

        System.out.println(pizza3);
        System.out.println(pizza3.pizzaPrice());
    }
}
