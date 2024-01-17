package by.piskunou.study.creational.factory.abstractf;

import by.piskunou.study.Main;
import by.piskunou.study.creational.factory.abstractf.chicago.ChicagoPizzaStore;
import by.piskunou.study.creational.factory.abstractf.newyork.NYPizzaStore;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;

public class AbstractFactoryMain implements Main {
	@Override
	public void start() {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.CLAM);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
