package by.piskunou.study.behavioral.iterator;

import by.piskunou.study.behavioral.iterator.menu.CafeMenu;
import by.piskunou.study.behavioral.iterator.menu.DinerMenu;
import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.PancakeHouseMenu;

public class IteratorMain {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
