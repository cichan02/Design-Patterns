package by.piskunou.study.structural.adapter.util;

import lombok.AllArgsConstructor;

import java.util.Enumeration;
import java.util.Iterator;

@AllArgsConstructor
public class EnumerationAdapter<E> implements Iterator<E> {
	Enumeration<E> enumeration;

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}
}
