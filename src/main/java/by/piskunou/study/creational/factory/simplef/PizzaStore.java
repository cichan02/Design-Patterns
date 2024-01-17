package by.piskunou.study.creational.factory.simplef;

import by.piskunou.study.domain.pizza.Pizza;
import by.piskunou.study.domain.pizza.PizzaType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PizzaStore {
	private final SimplePizzaFactory factory;
 
	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = factory.createPizza(pizzaType);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
