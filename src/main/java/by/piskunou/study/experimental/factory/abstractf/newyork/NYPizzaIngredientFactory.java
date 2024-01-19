package by.piskunou.study.experimental.factory.abstractf.newyork;

import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.impl.ReggianoCheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.impl.FreshClams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.impl.ThinCrustDough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.impl.SlicedPepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.impl.MarinaraSauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.Veggie;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.Garlic;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.Mushroom;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.Onion;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.RedPepper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	private static volatile NYPizzaIngredientFactory INSTANCE;

	public static NYPizzaIngredientFactory getInstance() {
		NYPizzaIngredientFactory result = INSTANCE;
		if (Objects.nonNull(result)) {
			return result;
		}
		synchronized (NYPizzaIngredientFactory.class) {
			if (Objects.isNull(INSTANCE)) {
				INSTANCE = new NYPizzaIngredientFactory();
			}
			return INSTANCE;
		}
	}

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public List<Veggie> createVeggies() {
		return new ArrayList<>(List.of(
				new Garlic(),
				new Onion(),
				new Mushroom(),
				new RedPepper()
		));
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}
}
