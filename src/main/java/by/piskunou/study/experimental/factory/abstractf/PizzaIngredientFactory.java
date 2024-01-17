package by.piskunou.study.experimental.factory.abstractf;

import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.clams.Clams;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.Veggie;

import java.util.List;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	List<Veggie> createVeggies();
	Pepperoni createPepperoni();
	Clams createClams();
}
