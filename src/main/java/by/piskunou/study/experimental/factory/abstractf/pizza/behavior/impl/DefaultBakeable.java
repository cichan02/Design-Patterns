package by.piskunou.study.experimental.factory.abstractf.pizza.behavior.impl;

import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.Bakeable;

public class DefaultBakeable implements Bakeable {
    @Override
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
}
