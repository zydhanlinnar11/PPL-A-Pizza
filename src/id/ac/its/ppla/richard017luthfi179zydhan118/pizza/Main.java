package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust.CheeseCrust;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.MozzarellaTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.MushroomTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.BeefTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.ChickenTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.PentolTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.SausageTopping;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.TunaTopping;

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
        
        Pizza customPizza1 = new Pizza(new PentolTopping(), new SausageTopping(), new CheeseCrust());
        Pizza customPizza2 = new Pizza(new PentolTopping(), new BeefTopping(), new TunaTopping(), new MozarellaTopping(), new CheeseCrust());
        Pizza completePizza = new Pizza(new MozarellaTopping(), new MushroomTopping(), new BeefTopping(), new ChickenTopping(), new PentolTopping(), new SausageTopping(), new TunaTopping(), new CheeseCrust());
        
        System.out.println(customPizza1);
        System.out.println(customPizza1.pizzaPrice());
        
        System.out.println(customPizza2);
        System.out.println(customPizza2.pizzaPrice());
        
        System.out.println(completePizza);
        System.out.println(completePizza.pizzaPrice());
    }
}
