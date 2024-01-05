package by.piskunou.study.creational.fmethod.chicago;

import by.piskunou.study.domain.pizzas.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() { 
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
 
		this.toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
