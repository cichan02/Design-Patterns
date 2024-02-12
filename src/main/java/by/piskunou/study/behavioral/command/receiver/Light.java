package by.piskunou.study.behavioral.command.receiver;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Light {
	private String location;

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}
