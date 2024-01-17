package by.piskunou.study.domain.pizza;

import java.util.List;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		this.name = "Pepperoni Pizza";
		this.dough = "Crust";
		this.sauce = "Marinara sauce";

		this.toppings.addAll(List.of(
				"Sliced Pepperoni",
				"Sliced Onion",
				"Grated parmesan cheese"
		));
	}
}
