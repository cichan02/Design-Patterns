package by.piskunou.study.creational.factory.abstractf;

import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.creational.factory.abstractf.pizza.ingredient.veggies.Veggies;

import java.util.List;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	List<Veggies> createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
