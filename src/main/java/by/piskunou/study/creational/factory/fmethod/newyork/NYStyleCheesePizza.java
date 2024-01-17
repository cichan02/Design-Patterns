package by.piskunou.study.creational.factory.fmethod.newyork;

import by.piskunou.study.domain.pizzas.Pizza;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() { 
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
 
		this.toppings.add("Grated Reggiano Cheese");
	}
}
