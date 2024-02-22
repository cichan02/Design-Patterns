package by.piskunou.study.behavioral.iterator;

import by.piskunou.study.Main;
import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.impl.CafeMenu;
import by.piskunou.study.behavioral.iterator.menu.impl.DinerMenu;
import by.piskunou.study.behavioral.iterator.menu.impl.PancakeHouseMenu;

import java.util.List;

public class IteratorMain implements Main {
	@Override
	public void start() {
		Menu pancakeHouseMenu = new PancakeHouseMenu("BREAKFAST");
		Menu dinerMenu = new DinerMenu("DINER");
		Menu cafeMenu = new CafeMenu("LUNCH");

		Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));

		waitress.printAllMenus();
	}
}
