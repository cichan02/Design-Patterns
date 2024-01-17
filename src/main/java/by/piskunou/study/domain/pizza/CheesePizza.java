package by.piskunou.study.domain.pizza;

import java.util.List;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		this.name = "Cheese Pizza";
		this.dough = "Regular Crust";
		this.sauce = "Marinara Pizza Sauce";

		this.toppings.addAll(List.of(
				"Fresh Mozzarella",
				"Parmesan"
		));
	}
}
