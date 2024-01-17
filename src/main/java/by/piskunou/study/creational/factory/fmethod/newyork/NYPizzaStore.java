package by.piskunou.study.creational.factory.fmethod.newyork;

import by.piskunou.study.creational.factory.fmethod.PizzaStore;
import by.piskunou.study.domain.pizza.Pizza;
import by.piskunou.study.domain.pizza.PizzaType;
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
