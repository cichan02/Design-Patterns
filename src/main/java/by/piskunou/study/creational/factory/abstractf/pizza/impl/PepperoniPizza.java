package by.piskunou.study.creational.factory.abstractf.pizza.impl;

import by.piskunou.study.creational.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.creational.factory.abstractf.pizza.Pizza;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
