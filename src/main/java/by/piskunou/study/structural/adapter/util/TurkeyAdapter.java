package by.piskunou.study.structural.adapter.util;

import by.piskunou.study.structural.adapter.models.Turkey;
import by.piskunou.study.structural.adapter.models.Duck;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
