package by.piskunou.study.structural.adapter.util;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Enumeration<E> {
	Iterator<E> iterator;

	public IteratorAdapter(Iterator<E> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return iterator.next();
	}

}
