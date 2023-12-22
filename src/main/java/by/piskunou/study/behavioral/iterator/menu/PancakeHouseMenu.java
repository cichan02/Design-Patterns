package by.piskunou.study.behavioral.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
	List<MenuItem> menuItems;
	
	{
		menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fries eggs, sausage", false, 2.99);
		addItem("Bluebery Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}
	
	public PancakeHouseMenu() {}
	
	public void addItem(String name, String description, boolean vegetaraian, double price) {
		menuItems.add(new MenuItem(name, description, vegetaraian, price));
	}

	@Override
	public Iterator<MenuItem> createItetaror() {
		return menuItems.iterator();
	}

}
