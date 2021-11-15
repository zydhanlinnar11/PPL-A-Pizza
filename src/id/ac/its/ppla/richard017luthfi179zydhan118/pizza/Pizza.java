package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.crust.PizzaCrust;
import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.PizzaTopping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private final int PIZZA_BASE_PRICE = 30000;
	private int price;
	private final ArrayList<PizzaTopping> pizzaToppings = new ArrayList<>();
	private final PizzaCrust crust;

	public Pizza(PizzaCrust crust, PizzaTopping primaryTopping) {
		this.crust = crust;
		pizzaToppings.add(primaryTopping);
		calculatePrice();
	}

	public Pizza(PizzaCrust crust, PizzaTopping primaryTopping, PizzaTopping[] optionalToppings) {
		this(crust, primaryTopping);
		pizzaToppings.addAll(List.of(optionalToppings));
		calculatePrice();
	}

	private void calculatePrice() {
		price = this.PIZZA_BASE_PRICE + crust.getPrice();
		for(PizzaTopping pizzaTopping: pizzaToppings) {
			price += pizzaTopping.getPrice();
		}
	}

	@Override
	public String toString() {
		String desc = "Here's your pizza with topping: ";

		for(PizzaTopping pizzaTopping: pizzaToppings) {
			desc += pizzaTopping.getName() + " ";
		}
		return desc;
	}

	public int pizzaPrice() {
		return this.price;
	}
}

