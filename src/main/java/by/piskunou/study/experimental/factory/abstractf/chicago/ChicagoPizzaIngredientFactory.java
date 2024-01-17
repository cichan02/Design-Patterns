package by.piskunou.study.experimental.factory.abstractf.chicago;

import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.impl.MozzarellaCheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.impl.FrozenClams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.impl.ThickCrustDough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.impl.SlicedPepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.impl.PlumTomatoSauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.Veggie;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.BlackOlives;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.Eggplant;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.impl.Spinach;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	private static volatile ChicagoPizzaIngredientFactory INSTANCE;

	public static ChicagoPizzaIngredientFactory getInstance() {
		ChicagoPizzaIngredientFactory result = INSTANCE;
		if (Objects.nonNull(result)) {
			return result;
		}
		synchronized (ChicagoPizzaIngredientFactory.class) {
			if (Objects.isNull(INSTANCE)) {
				INSTANCE = new ChicagoPizzaIngredientFactory();
			}
			return INSTANCE;
		}
	}

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public List<Veggie> createVeggies() {
        return new ArrayList<>(List.of(
				new BlackOlives(),
				new Spinach(),
				new Eggplant()
		));
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}
}
