package by.piskunou.study.structural.composite;

import by.piskunou.study.structural.composite.menu.MenuComponent;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Waitress {
	private final MenuComponent allMenus;
 
	public void printMenu() {
		allMenus.print();
	}
}
