package by.piskunou.study.creational.factory.fmethod.chicago;

import by.piskunou.study.domain.pizzas.Pizza;

import java.util.List;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		this.name = "Chicago Style Clam Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
 
		this.toppings.addAll(List.of(
				"Shredded Mozzarella Cheese",
				"Frozen Clams from Chesapeake Bay"
		));
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
