package by.piskunou.study.creational.factory.abstractf;

import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.CheesePizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.ClamPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.PepperoniPizza;
import by.piskunou.study.creational.factory.abstractf.pizza.impl.VeggiePizza;
import by.piskunou.study.domain.pizzas.PizzaType;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public abstract class PizzaStore {
	protected final PizzaIngredientFactory ingredientFactory;

    protected Pizza createPizza(@NotNull PizzaType pizzaType) {
		return switch (pizzaType) {
			case CHEESE -> new CheesePizza(this.ingredientFactory);
			case VEGGIE -> new VeggiePizza(this.ingredientFactory);
			case CLAM -> new ClamPizza(this.ingredientFactory);
			case PEPPERONI -> new PepperoniPizza(this.ingredientFactory);
		};
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
