package by.piskunou.study.behavioral.command.receiver;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GarageDoor {
	private final String location;

	public void up() {
		System.out.println(location + " garage Door is Up");
	}

	public void down() {
		System.out.println(location + " garage Door is Down");
	}

	public void stop() {
		System.out.println(location + " garage Door is Stopped");
	}

	public void lightOn() {
		System.out.println(location + " garage light is on");
	}

	public void lightOff() {
		System.out.println(location + " garage light is off");
	}
}
