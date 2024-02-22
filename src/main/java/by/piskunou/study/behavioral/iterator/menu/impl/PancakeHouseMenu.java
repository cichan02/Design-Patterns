package by.piskunou.study.behavioral.iterator.menu.impl;

import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class PancakeHouseMenu extends Menu {
	private List<MenuItem> menuItems;
	
	{
		menuItems = new ArrayList<>();

		addItem(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		addItem(new MenuItem("Regular Pancake Breakfast", "Pancakes with fries eggs, sausage", false, 2.99));
		addItem(new MenuItem("Bluebery Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		addItem(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
	}

	public PancakeHouseMenu(String name) {
		super(name);
	}

	@Override
	public void addItem(MenuItem menuItem) {
		this.menuItems.add(menuItem);
	}

	@NotNull
	@Override
	public Iterator<MenuItem> iterator() {
		return this.menuItems.iterator();
	}
}
