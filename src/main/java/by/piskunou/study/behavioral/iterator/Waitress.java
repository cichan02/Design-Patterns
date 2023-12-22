package by.piskunou.study.behavioral.iterator;

import java.util.Iterator;

import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
public class Waitress {
	private final Menu pancakeHouseMenu;
	private final Menu dinerMenu;
	private final Menu cafeMenu;

	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenu.createIterator());
		System.out.println("\nLUNCH");
		printMenu(dinerMenu.createIterator());
		System.out.println("\nDINNER");
		printMenu(cafeMenu.createIterator());
	}

	public void printMenu(@NotNull Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
