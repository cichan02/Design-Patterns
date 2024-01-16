package by.piskunou.study.creational.fmethod.newyork;

import by.piskunou.study.creational.fmethod.PizzaStore;
import by.piskunou.study.domain.pizzas.Pizza;
import org.jetbrains.annotations.NotNull;

public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(@NotNull String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
	}
}
