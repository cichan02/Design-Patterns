package by.piskunou.study.domain.pizza;

import java.util.List;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		this.name = "Clam Pizza";
		this.dough = "Thin crust";
		this.sauce = "White garlic sauce";

		this.toppings.addAll(List.of(
				"Clams",
				"Grated parmesan cheese"
		));
	}
}
