package by.piskunou.study.headfirst.command.diner;

public class BurgerAndFriesOrder implements Order {
	Cook cook;
	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}
}
