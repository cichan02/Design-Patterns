package by.piskunou.study.behavioral.iterator;

import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@AllArgsConstructor
public class Waitress {
	private List<Menu> menus;

	public void printAllMenus() {
		System.out.println("MENU\n----------------------------------------------------------------\n");
		menus.forEach(this::printMenu);
	}

	public void printMenu(@NotNull Menu menu) {
		System.out.println(menu.getName());
		for (MenuItem menuItem: menu) {
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		System.out.println();
	}
}
