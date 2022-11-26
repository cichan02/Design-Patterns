package behavioral.iterator.menu;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] items;
	private int position;
	

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		this.position = Calendar.DAY_OF_WEEK % 2;
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
		MenuItem menuItem = items[position];
		position += 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Alternating Diner Menu Iterator doesn'r support remove()");
	}
}
