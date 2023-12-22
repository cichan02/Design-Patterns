package by.piskunou.study.behavioral.iterator.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	{
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot-dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
	}
	
	public DinerMenu() {}
	
	public void addItem(String name, String description, boolean vegetaraian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetaraian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!!!Can't add item to menu");
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}
	
	@Override
	public Iterator<MenuItem> createItetaror() {
		return new DinerMenuIterator(menuItems);
	}

}
