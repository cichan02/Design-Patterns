package by.piskunou.study.experimental.factory.abstractf;

import by.piskunou.study.Main;
import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.chicago.ChicagoPizzaStore;
import by.piskunou.study.experimental.factory.abstractf.newyork.NYPizzaStore;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;

public class MyAbstractFactoryMain implements Main {
	@Override
	public void start() {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza(PizzaType.CLAM);
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza + "\n");

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
