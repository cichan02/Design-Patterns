package by.piskunou.study.behavioral.iterator;

import by.piskunou.study.Main;
import by.piskunou.study.behavioral.iterator.menu.CafeMenu;
import by.piskunou.study.behavioral.iterator.menu.DinerMenu;
import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.PancakeHouseMenu;

public class IteratorMain implements Main {
	@Override
	public void start() {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

		waitress.printMenu();
	}
}
