package by.piskunou.study.experimental.factory.abstractf.newyork;

import by.piskunou.study.experimental.factory.abstractf.PizzaIngredientFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionCrush {
    public static void main(String[] args) {
        PizzaIngredientFactory factory1 = NYPizzaIngredientFactory.getInstance();
        PizzaIngredientFactory factory2 = null;
        try {
            Constructor<?>[] constructors = NYPizzaIngredientFactory.class.getDeclaredConstructors();
            for (Constructor<?> constructor: constructors) {
                constructor.setAccessible(true);
                factory2 = (NYPizzaIngredientFactory) constructor.newInstance();
                break;
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(factory1.hashCode());
        assert factory2 != null;
        System.out.println(factory2.hashCode());
        System.out.println(factory1.hashCode() == factory2.hashCode());
    }
}
