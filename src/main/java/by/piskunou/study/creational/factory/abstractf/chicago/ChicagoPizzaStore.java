package by.piskunou.study.creational.factory.abstractf.chicago;

import by.piskunou.study.creational.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.creational.factory.abstractf.PizzaStore;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.CheesePizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.ClamPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.PepperoniPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.VeggiePizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(@NotNull PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (pizzaType) {
            case CHEESE -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case VEGGIE -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case CLAM -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
            case PEPPERONI -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
        }

        return pizza;
	}
}
