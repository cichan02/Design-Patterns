package by.piskunou.study.behavioral.command.receiver;

import lombok.Getter;

@Getter
public class CeilingFan {
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;

	private final String location;

	private int level;

    public CeilingFan(String location) {
		this.location = location;
	}

    public void high() {
		level = HIGH;
		System.out.println(location + " ceiling fan is on high");
	} 

	public void medium() {
		level = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		level = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
 
	public void off() {
		level = LOW;
		System.out.println(location + " ceiling fan is off");
	}
}
