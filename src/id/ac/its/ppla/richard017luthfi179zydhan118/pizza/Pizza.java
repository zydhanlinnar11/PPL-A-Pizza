package id.ac.its.ppla.richard017luthfi179zydhan118.pizza;

import id.ac.its.ppla.richard017luthfi179zydhan118.pizza.toppings.PizzaTopping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private int price;
	private final ArrayList<PizzaTopping> pizzaToppings = new ArrayList<>();

	public Pizza(PizzaTopping primaryTopping) {
		pizzaToppings.add(primaryTopping);
		calculatePrice();
	}

	public Pizza(PizzaTopping primaryTopping, PizzaTopping[] optionalToppings) {
		this(primaryTopping);
		pizzaToppings.addAll(List.of(optionalToppings));
		calculatePrice();
	}

	private void calculatePrice() {
		price = 0;
		for(PizzaTopping pizzaTopping: pizzaToppings) {
			price += pizzaTopping.getPrice();
		}
	}

	@Override
	public String toString() {
		String desc = "Here's your pizza with topping: ";

		for(PizzaTopping pizzaTopping: pizzaToppings) {
			desc += pizzaTopping + " ";
		}
		return desc;
	}

	public int pizzaPrice() {
		return this.price;
	}
}

