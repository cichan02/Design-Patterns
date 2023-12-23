package by.piskunou.study.structural.decorator.startbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
