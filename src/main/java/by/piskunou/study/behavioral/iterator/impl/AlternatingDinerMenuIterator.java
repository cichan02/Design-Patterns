package by.piskunou.study.behavioral.iterator.impl;

import by.piskunou.study.behavioral.iterator.menu.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
	private final MenuItem[] menuItems;
	private int position;

	public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
		this.position = Calendar.DAY_OF_WEEK % 2;
	}

	@Override
	public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position += 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Alternating Diner Menu Iterator doesn't support remove()");
	}
}
