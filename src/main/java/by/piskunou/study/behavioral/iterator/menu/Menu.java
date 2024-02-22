package by.piskunou.study.behavioral.iterator.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Menu implements Iterable<MenuItem> {
	protected String name;

	public abstract void addItem(MenuItem menuItem);
}
