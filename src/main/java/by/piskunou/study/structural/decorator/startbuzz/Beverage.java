package by.piskunou.study.structural.decorator.startbuzz;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Beverage {
    String description = "Unknown Beverage";
    @Setter
    Size size = Size.TALL;

    public abstract double cost();
}
