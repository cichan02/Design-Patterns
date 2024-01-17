package by.piskunou.study.creational.factory.fmethod.newyork;

import by.piskunou.study.creational.factory.fmethod.PizzaStore;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(@NotNull PizzaType pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new NYStyleCheesePizza();
            case VEGGIE -> new NYStyleVeggiePizza();
            case CLAM -> new NYStyleClamPizza();
            case PEPPERONI -> new NYStylePepperoniPizza();
        };
	}
}
