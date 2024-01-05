package by.piskunou.study.creational.fmethod.chicago;

import by.piskunou.study.creational.fmethod.PizzaStore;
import by.piskunou.study.domain.pizzas.Pizza;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(@NotNull String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
	}
}
