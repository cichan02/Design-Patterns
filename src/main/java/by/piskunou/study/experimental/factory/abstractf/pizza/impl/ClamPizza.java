package by.piskunou.study.experimental.factory.abstractf.pizza.impl;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import org.jetbrains.annotations.NotNull;

public class ClamPizza extends Pizza {
    protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clams clams;

    public ClamPizza(@NotNull PizzaIngredientFactory ingredientFactory) {
        super();
        this.type = PizzaType.CLAM;
        this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.clams = ingredientFactory.createClams();
    }

	@Override
	public String toString() {
		return super.toString() +
				dough + '\n' +
				sauce + '\n' +
				cheese + '\n' +
				clams + '\n';
	}
}
