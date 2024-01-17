package by.piskunou.study.creational.factory.fmethod.chicago;

import by.piskunou.study.creational.factory.fmethod.PizzaStore;
import by.piskunou.study.domain.pizza.Pizza;
import by.piskunou.study.domain.pizza.PizzaType;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(@NotNull PizzaType pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            case CLAM -> new ChicagoStyleClamPizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
        };
	}
}
