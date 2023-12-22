package by.piskunou.study.behavioral.iterator.menu;

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
		if(position >= items.length || items[position] == null) {
			return false;
		}
		return true;
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
