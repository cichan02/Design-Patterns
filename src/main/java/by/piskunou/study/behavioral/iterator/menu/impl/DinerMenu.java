package by.piskunou.study.behavioral.iterator.menu.impl;

import by.piskunou.study.behavioral.iterator.impl.DinerMenuIterator;
import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class DinerMenu extends AbstractMenu {
	private static final int MAX_ITEMS = 6;

	@Getter
	@Setter
	private MenuItem[] menuItems;

	private int numberOfItems = 0;
	
	{
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		addItem(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		addItem(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
		addItem(new MenuItem("Hotdog", "A hot-dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
	}


	public DinerMenu(String name) {
		super(name);
	}

	@Override
	public void addItem(MenuItem menuItem) {
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!!! Can't add item to menu");
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}

	@NotNull
	@Override
	public Iterator<MenuItem> iterator() {
		return new DinerMenuIterator(menuItems);
	}
}
