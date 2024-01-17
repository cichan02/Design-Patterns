package by.piskunou.study.experimental.factory.abstractf.chicago;

import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.Cuttable;

public class ChicagoCuttable implements Cuttable {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
