package by.piskunou.study.creational.factory.abstractf;

import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;

public abstract class PizzaStore {
	protected abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
