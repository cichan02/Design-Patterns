package by.piskunou.study.behavioral.command.impl.on;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.GarageDoor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GarageDoorUpCommand implements Command {
	private GarageDoor garageDoor;

	@Override
	public void execute() {
		garageDoor.up();
	}
}
