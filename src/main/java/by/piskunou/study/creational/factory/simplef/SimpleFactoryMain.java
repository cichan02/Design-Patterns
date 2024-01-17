package by.piskunou.study.creational.factory.simplef;

import by.piskunou.study.Main;
import by.piskunou.study.domain.pizzas.Pizza;
import by.piskunou.study.domain.pizzas.PizzaType;

public class SimpleFactoryMain implements Main {
    @Override
    public void start() {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza(PizzaType.VEGGIE);
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
