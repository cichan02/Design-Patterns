package by.piskunou.study.experimental.factory.abstractf;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public abstract class PizzaStore {
	protected final PizzaIngredientFactory ingredientFactory;

	protected Pizza createPizza(@NotNull PizzaType pizzaType) {
		return PizzaGenerator.next(pizzaType, ingredientFactory);
	}

    public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
