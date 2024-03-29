package by.piskunou.study.creational.factory.abstractf.newyork;

import by.piskunou.study.creational.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.cheese.impl.ReggianoCheese;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.clams.impl.FreshClams;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.dough.impl.ThinCrustDough;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.pepperoni.impl.SlicedPepperoni;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.sauce.impl.MarinaraSauce;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.Veggies;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.Garlic;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.Mushroom;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.Onion;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.impl.RedPepper;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public List<Veggies> createVeggies() {
		return new ArrayList<>(List.of(
				new Garlic(),
				new Onion(),
				new Mushroom(),
				new RedPepper()
		));
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
