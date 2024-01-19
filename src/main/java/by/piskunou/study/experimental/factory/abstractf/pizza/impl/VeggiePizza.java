package by.piskunou.study.experimental.factory.abstractf.pizza.impl;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.Veggie;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class VeggiePizza extends Pizza {
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected List<Veggie> veggies;

	public VeggiePizza(@NotNull PizzaIngredientFactory ingredientFactory) {
        super();
        this.type = PizzaType.VEGGIE;
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.veggies = ingredientFactory.createVeggies();
	}

	@Override
	public String toString() {
		return super.toString() +
                dough + '\n' +
                sauce + '\n' +
                cheese + '\n' +
                veggies.stream()
                        .map(Veggie::toString)
                        .collect(Collectors.joining(", ")) +
				'\n';
	}
}
