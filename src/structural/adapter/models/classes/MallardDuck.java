package structural.adapter.models.classes;

import structural.adapter.models.interfaces.Duck;

public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
