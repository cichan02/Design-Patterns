package by.piskunou.study.creational.simplef;

import by.piskunou.study.Main;
import by.piskunou.study.domain.pizzas.Pizza;

public class SimpleFactoryMain implements Main {
    @Override
    public void start() {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
