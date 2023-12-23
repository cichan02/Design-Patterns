package by.piskunou.study.structural.decorator;

import by.piskunou.study.Main;
import by.piskunou.study.structural.decorator.startbuzz.Beverage;
import by.piskunou.study.structural.decorator.startbuzz.DarkRoast;
import by.piskunou.study.structural.decorator.startbuzz.Espresso;
import by.piskunou.study.structural.decorator.startbuzz.HouseBlend;
import by.piskunou.study.structural.decorator.startbuzz.Mocha;
import by.piskunou.study.structural.decorator.startbuzz.Soy;
import by.piskunou.study.structural.decorator.startbuzz.Whip;
import org.jetbrains.annotations.NotNull;

public class DecoratorMain implements Main {
    @Override
    public void start() {
        Beverage beverage1 = new Espresso();
        printBeverage(beverage1);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printBeverage(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        printBeverage(beverage3);
    }

    private void printBeverage(@NotNull Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
