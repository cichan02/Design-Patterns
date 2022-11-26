package behavioral.iterator.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
	Map<String, MenuItem> menuItems;
	
	{
		menuItems = new HashMap<>();
		
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
		addItem("A cup of the soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
	}
	
	public void addItem(String name, String description, boolean vegetaraian, double price) {
		menuItems.put(name, new MenuItem(name, description, vegetaraian, price));
	}
	

	@Override
	public Iterator<MenuItem> createItetaror() {
		return menuItems.values().iterator();
	}

}
