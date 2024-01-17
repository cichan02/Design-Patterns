package by.piskunou.study.experimental.factory.abstractf.pizza;

import by.piskunou.study.domain.pizza.PizzaType;
import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.Bakeable;
import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.Cuttable;
import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.impl.DefaultBakeable;
import by.piskunou.study.experimental.factory.abstractf.pizza.behavior.impl.DefaultCuttable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza {
	protected String name;
	@Setter(AccessLevel.NONE)
	protected PizzaType type;
	protected Bakeable bakeStrategy = new DefaultBakeable();
	protected Cuttable cutStrategy = new DefaultCuttable();

    public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		bakeStrategy.bake();
	}

	public void cut() {
		cutStrategy.cut();
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
        return "\n---- " + name + " ----\n";
	}
}
