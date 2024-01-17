package by.piskunou.study.structural.adapter.util;

import by.piskunou.study.domain.duck.Duck;
import by.piskunou.study.domain.duck.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
	private final Duck duck;
	private final Random rand;
	
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
