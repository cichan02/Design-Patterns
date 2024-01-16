package by.piskunou.study.creational.fmethod.newyork;

import by.piskunou.study.domain.pizzas.Pizza;

import java.util.List;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		this.name = "NY Style Clam Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		this.toppings.addAll(List.of(
				"Grated Reggiano Cheese",
				"Fresh Clams from Long Island Sound"
		));
	}
}
