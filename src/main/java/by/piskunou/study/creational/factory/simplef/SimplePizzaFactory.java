package by.piskunou.study.creational.factory.simplef;

import by.piskunou.study.domain.pizza.CheesePizza;
import by.piskunou.study.domain.pizza.ClamPizza;
import by.piskunou.study.domain.pizza.PepperoniPizza;
import by.piskunou.study.domain.pizza.Pizza;
import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.domain.pizza.VeggiePizza;
import org.jetbrains.annotations.NotNull;

public class SimplePizzaFactory {
	public Pizza createPizza(@NotNull PizzaType pizzaType) {
		return switch (pizzaType) {
			case CHEESE -> new CheesePizza();
			case PEPPERONI -> new PepperoniPizza();
			case CLAM -> new ClamPizza();
			case VEGGIE -> new VeggiePizza();
		};
	}
}
