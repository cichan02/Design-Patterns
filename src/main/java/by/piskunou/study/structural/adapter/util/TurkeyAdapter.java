package by.piskunou.study.structural.adapter.util;

import by.piskunou.study.domain.duck.Duck;
import by.piskunou.study.domain.duck.Turkey;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurkeyAdapter implements Duck {
	private final Turkey turkey;

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
