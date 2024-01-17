package by.piskunou.study.experimental.factory.abstractf;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.impl.CheesePizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.impl.ClamPizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.impl.PepperoniPizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.impl.VeggiePizza;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Function;

public class PizzaGenerator {
    private static final Map<PizzaType, Function<PizzaIngredientFactory, Pizza>> PIZZAS = Map.of(
            PizzaType.CHEESE, PizzaGenerator::genCheesePizza,
            PizzaType.CLAM, PizzaGenerator::genClamPizza,
            PizzaType.PEPPERONI, PizzaGenerator::genPepperoniPizza,
            PizzaType.VEGGIE, PizzaGenerator::genVeggiePizza
    );

    public static Pizza next(PizzaType pizzaType, PizzaIngredientFactory ingredientFactory) {
        return PIZZAS.get(pizzaType).apply(ingredientFactory);
    }

    @Contract("_ -> new")
    private static @NotNull Pizza genCheesePizza(PizzaIngredientFactory ingredientFactory) {
        return new CheesePizza(ingredientFactory);
    }

    @Contract("_ -> new")
    private static @NotNull Pizza genClamPizza(PizzaIngredientFactory ingredientFactory) {
        return new ClamPizza(ingredientFactory);
    }

    @Contract("_ -> new")
    private static @NotNull Pizza genPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        return new PepperoniPizza(ingredientFactory);
    }

    @Contract("_ -> new")
    private static @NotNull Pizza genVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        return new VeggiePizza(ingredientFactory);
    }
}
