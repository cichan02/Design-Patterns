package by.piskunou.study.creational.factory.fmethod.chicago;

import by.piskunou.study.domain.pizzas.Pizza;

import java.util.List;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		this.name = "Chicago Style Pepperoni Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";

		this.toppings.addAll(List.of(
				"Shredded Mozzarella Cheese",
				"Black Olives",
				"Spinach",
				"Eggplant",
				"Sliced Pepperoni"
		));
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
