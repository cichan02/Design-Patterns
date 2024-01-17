package by.piskunou.study.creational.factory.fmethod.newyork;

import by.piskunou.study.domain.pizzas.Pizza;

import java.util.List;

public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza() {
		this.name = "NY Style Pepperoni Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		this.toppings.addAll(List.of(
				"Grated Reggiano Cheese",
				"Sliced Pepperoni",
				"Garlic",
				"Onion",
				"Mushrooms",
				"Red Pepper"
		));
	}
}
