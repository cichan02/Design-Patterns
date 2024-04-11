package by.piskunou.study.structural.composite.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public void print() {
		System.out.print(" " + name);
		if(vegetarian) {
			System.out.print("(v)");
		}
		System.out.println(", " + price);
		System.out.println("   --" + description);
	}
}
