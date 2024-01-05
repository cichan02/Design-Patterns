package by.piskunou.study.creational.fmethod;

import by.piskunou.study.domain.pizzas.Pizza;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = this.createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
