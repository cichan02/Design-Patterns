package by.piskunou.study.experimental.factory.abstractf.pizza.impl;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;
import by.piskunou.study.experimental.factory.abstractf.pizza.Pizza;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.cheese.Cheese;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.dough.Dough;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.pepperoni.Pepperoni;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.sauce.Sauce;
import by.piskunou.study.experimental.factory.abstractf.pizza.ingredient.veggie.Veggie;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PepperoniPizza extends Pizza {
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected List<Veggie> veggies;
    protected Pepperoni pepperoni;

    public PepperoniPizza(@NotNull PizzaIngredientFactory ingredientFactory) {
        super();
        this.type = PizzaType.PEPPERONI;
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.veggies = ingredientFactory.createVeggies();
        this.pepperoni = ingredientFactory.createPepperoni();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString())
                .append(dough).append('\n')
                .append(sauce).append('\n')
                .append(cheese).append('\n')
                .append(pepperoni).append('\n');
        veggies.forEach(veggie -> result.append(veggie).append('\n'));
        return result.toString();
    }
}
