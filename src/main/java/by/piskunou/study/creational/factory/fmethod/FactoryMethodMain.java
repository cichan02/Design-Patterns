package by.piskunou.study.creational.factory.fmethod;

import by.piskunou.study.Main;
import by.piskunou.study.creational.factory.fmethod.chicago.ChicagoPizzaStore;
import by.piskunou.study.creational.factory.fmethod.newyork.NYPizzaStore;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;

public class FactoryMethodMain implements Main {
    @Override
    public void start() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.CLAM);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
