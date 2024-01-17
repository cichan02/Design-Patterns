package by.piskunou.study.creational.factory.abstractf.newyork;

import by.piskunou.study.creational.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.creational.factory.abstractf.PizzaStore;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.CheesePizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.ClamPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.PepperoniPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.VeggiePizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(@NotNull PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (pizzaType) {
            case CHEESE -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case VEGGIE -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case CLAM -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case PEPPERONI -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }

		return pizza;
	}
}
