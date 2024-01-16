package by.piskunou.study.creational.fmethod.chicago;

import by.piskunou.study.creational.fmethod.PizzaStore;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(@NotNull PizzaType item) {
        return switch (item) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            case CLAM -> new ChicagoStyleClamPizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
        };
	}
}
