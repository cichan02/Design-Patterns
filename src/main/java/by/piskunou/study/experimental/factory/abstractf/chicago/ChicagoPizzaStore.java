package by.piskunou.study.experimental.factory.abstractf.chicago;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.PizzaStore;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import org.jetbrains.annotations.NotNull;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        super(ChicagoPizzaIngredientFactory.getInstance());
    }

    @Override
    public Pizza createPizza(@NotNull PizzaType pizzaType) {
        Pizza pizza = super.createPizza(pizzaType);

        switch (pizzaType) {
            case CHEESE -> {
                pizza.setName("Chicago Style Cheese Pizza");
                pizza.setCutStrategy(new ChicagoCuttable());
            }
            case VEGGIE -> pizza.setName("Chicago Style Veggie Pizza");
            case CLAM -> pizza.setName("Chicago Style Clam Pizza");
            case PEPPERONI -> pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
