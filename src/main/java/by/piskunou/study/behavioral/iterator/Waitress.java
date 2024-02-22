package by.piskunou.study.behavioral.iterator;

import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import by.piskunou.study.behavioral.iterator.menu.impl.AbstractMenu;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@AllArgsConstructor
public class Waitress {
	private List<AbstractMenu> menus;

	public void printAllMenus() {
		System.out.println("MENU\n----------------------------------------------------------------\n");
		menus.forEach(this::printMenu);
	}

	public void printMenu(@NotNull AbstractMenu menu) {
		System.out.println(menu.getName());
		for (MenuItem menuItem: menu) {
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
		System.out.println();
	}
}
