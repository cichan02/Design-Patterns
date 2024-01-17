package by.piskunou.study.creational.factory.fmethod.newyork;

import by.piskunou.study.domain.pizza.Pizza;

import java.util.List;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		this.name = "NY Style Veggie Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		this.toppings.addAll(List.of(
				"Grated Reggiano Cheese",
				"Garlic",
				"Onion",
				"Mushrooms",
				"Red Pepper"
		));
	}
}
