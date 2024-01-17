package by.piskunou.study.experimental.factory.abstractf.pizza.behavior.impl;

import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.Cuttable;

public class DefaultCuttable implements Cuttable {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
