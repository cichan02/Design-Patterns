package by.piskunou.study.creational.fmethod.chicago;

import by.piskunou.study.domain.pizzas.Pizza;

import java.util.List;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		this.name = "Chicago Deep Dish Veggie Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";

		this.toppings.addAll(List.of(
				"Shredded Mozzarella Cheese",
				"Black Olives",
				"Spinach",
				"Eggplant"
		));
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
