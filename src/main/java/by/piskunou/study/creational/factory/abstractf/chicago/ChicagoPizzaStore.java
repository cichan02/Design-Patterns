package by.piskunou.study.creational.factory.abstractf.chicago;

import by.piskunou.study.creational.factory.abstractf.PizzaStore;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        super(ChicagoPizzaIngredientFactory.getInstance());
    }

    @Override
    public Pizza createPizza(@NotNull PizzaType pizzaType) {
		Pizza pizza = super.orderPizza(pizzaType);

        switch (pizzaType) {
            case CHEESE -> pizza.setName("Chicago Style Cheese Pizza");
            case VEGGIE -> pizza.setName("Chicago Style Veggie Pizza");
            case CLAM -> pizza.setName("Chicago Style Clam Pizza");
            case PEPPERONI -> pizza.setName("Chicago Style Pepperoni Pizza");
        }
		return pizza;
	}
}
