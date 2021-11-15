package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.Mozzarella;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new Mozzarella());

        System.out.println(pizza);
        System.out.println(pizza.pizzaPrice());
    }
}
