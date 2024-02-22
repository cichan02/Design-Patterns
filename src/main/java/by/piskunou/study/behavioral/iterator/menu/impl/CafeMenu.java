package by.piskunou.study.behavioral.iterator.menu.impl;

import by.piskunou.study.behavioral.iterator.menu.Menu;
import by.piskunou.study.behavioral.iterator.menu.MenuItem;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Getter
@Setter
public class CafeMenu extends Menu {
	private Map<String, MenuItem> menuItems;
	
	{
		menuItems = new HashMap<>();
		
		addItem(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
		addItem(new MenuItem("A cup of the soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
		addItem(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
	}

	public CafeMenu(String name) {
		super(name);
	}

	@Override
	public void addItem(MenuItem menuItem) {
		this.menuItems.put(menuItem.getName(), menuItem);
	}

	@NotNull
	@Override
	public Iterator<MenuItem> iterator() {
		return this.menuItems.values().iterator();
	}
}
