package behavioral.iterator;

import behavioral.iterator.menu.CafeMenu;
import behavioral.iterator.menu.DinerMenu;
import behavioral.iterator.menu.Menu;
import behavioral.iterator.menu.PancakeHouseMenu;

public class IteratorMain {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
