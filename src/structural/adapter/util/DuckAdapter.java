package structural.adapter.util;

import java.util.Random;

import structural.adapter.models.Duck;
import structural.adapter.models.Turkey;

public class DuckAdapter implements Turkey {
	private Duck duck;
	private Random rand;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(rand.nextInt(5) == 0) {
			duck.fly();
		}
	}
}
