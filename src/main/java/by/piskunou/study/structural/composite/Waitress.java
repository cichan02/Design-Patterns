package by.piskunou.study.structural.composite;

import by.piskunou.study.structural.composite.menu.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
