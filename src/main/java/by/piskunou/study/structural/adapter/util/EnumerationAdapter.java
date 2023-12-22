package by.piskunou.study.structural.adapter.util;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<E> implements Iterator<E> {
	Enumeration<E> enumeration;
	
	public EnumerationAdapter(Enumeration<E> enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}
}
