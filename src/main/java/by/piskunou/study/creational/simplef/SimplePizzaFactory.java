package by.piskunou.study.creational.simplef;

import by.piskunou.study.domain.pizzas.CheesePizza;
import by.piskunou.study.domain.pizzas.ClamPizza;
import by.piskunou.study.domain.pizzas.PepperoniPizza;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.VeggiePizza;
import org.jetbrains.annotations.NotNull;

public class SimplePizzaFactory {
	public Pizza createPizza(@NotNull String type) {
		return switch (type) {
			case "cheese" -> new CheesePizza();
			case "pepperoni" -> new PepperoniPizza();
			case "clam" -> new ClamPizza();
			case "veggie" -> new VeggiePizza();
			default -> null;
		};
	}
}
