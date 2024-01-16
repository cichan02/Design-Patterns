package by.piskunou.study.creational.fmethod;

import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(PizzaType item);
 
	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = this.createPizza(pizzaType);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
