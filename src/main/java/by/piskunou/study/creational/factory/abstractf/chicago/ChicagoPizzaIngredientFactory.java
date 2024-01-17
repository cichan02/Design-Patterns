package by.piskunou.study.creational.factory.abstractf.chicago;

import by.piskunou.study.creational.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.cheese.impl.MozzarellaCheese;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.clams.impl.FrozenClams;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.dough.impl.ThickCrustDough;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.pepperoni.impl.SlicedPepperoni;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.sauce.impl.PlumTomatoSauce;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.Veggies;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.BlackOlives;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.Eggplant;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.Spinach;
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

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public List<Veggies> createVeggies() {
        return new ArrayList<>(List.of(
				new BlackOlives(),
				new Spinach(),
				new Eggplant()
		));
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
