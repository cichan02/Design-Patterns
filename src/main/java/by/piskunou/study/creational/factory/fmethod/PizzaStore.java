package by.piskunou.study.creational.factory.fmethod;

import by.piskunou.study.domain.pizza.Pizza;
import by.piskunou.study.domain.pizza.PizzaType;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(PizzaType pizzaType);
 
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
