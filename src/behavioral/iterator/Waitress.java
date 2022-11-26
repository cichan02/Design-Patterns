package behavioral.iterator;

import java.util.Iterator;

import behavioral.iterator.menu.Menu;
import behavioral.iterator.menu.MenuItem;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenu.createItetaror());
		System.out.println("\nLUNCH");
		printMenu(dinerMenu.createItetaror());
		System.out.println("\nDINNER");
		printMenu(cafeMenu.createItetaror());
	}

	public void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
