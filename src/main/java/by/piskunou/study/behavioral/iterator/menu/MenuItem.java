package by.piskunou.study.behavioral.iterator.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItem {
	private String name;
	private String description;
	private boolean isVegetarian;
	private double price;
}
