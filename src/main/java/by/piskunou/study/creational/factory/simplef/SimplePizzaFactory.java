package by.piskunou.study.creational.factory.simplef;

import by.piskunou.study.domain.pizzas.CheesePizza;
import by.piskunou.study.domain.pizzas.ClamPizza;
import by.piskunou.study.domain.pizzas.PepperoniPizza;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import by.piskunou.study.domain.pizzas.VeggiePizza;
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
