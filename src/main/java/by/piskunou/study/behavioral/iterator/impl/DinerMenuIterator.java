package by.piskunou.study.behavioral.iterator.impl;

import by.piskunou.study.behavioral.iterator.menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private final MenuItem[] items;
	private int position;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

	@Override
	public MenuItem next() {
		return items[position++];	
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove menu items");
	}
}
