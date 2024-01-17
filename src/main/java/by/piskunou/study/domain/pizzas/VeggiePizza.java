package by.piskunou.study.domain.pizzas;

import java.util.List;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		this.name = "Veggie Pizza";
		this.dough = "Crust";
		this.sauce = "Marinara sauce";

		this.toppings.addAll(List.of(
				"Grated parmesan",
				"Diced onion",
				"Sliced mushrooms",
				"Sliced red pepper",
				"Sliced black olives"
		));
	}
}
