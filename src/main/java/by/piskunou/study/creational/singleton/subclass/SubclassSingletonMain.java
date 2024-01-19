package by.piskunou.study.creational.singleton.subclass;

import by.piskunou.study.Main;

public class SubclassSingletonMain implements Main {
	@Override
	public void start() {
		ParentSingleton foo = CoolerSingleton.getInstance();
		ParentSingleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
	}
}
