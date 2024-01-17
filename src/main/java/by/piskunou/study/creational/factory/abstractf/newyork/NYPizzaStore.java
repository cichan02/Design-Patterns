package by.piskunou.study.creational.factory.abstractf.newyork;

import by.piskunou.study.creational.factory.abstractf.PizzaStore;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
        super(NYPizzaIngredientFactory.getInstance());
    }

    @Override
    public Pizza createPizza(@NotNull PizzaType pizzaType) {
		Pizza pizza = super.createPizza(pizzaType);

        switch (pizzaType) {
            case CHEESE -> pizza.setName("New York Style Cheese Pizza");
            case VEGGIE -> pizza.setName("New York Style Veggie Pizza");
            case CLAM -> pizza.setName("New York Style Clam Pizza");
            case PEPPERONI -> pizza.setName("New York Style Pepperoni Pizza");
        }

		return pizza;
	}
}
