package by.piskunou.study.behavioral.command.impl.off;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.GarageDoor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GarageDoorDownCommand implements Command {
	private GarageDoor garageDoor;

	@Override
	public void execute() {
		garageDoor.up();
	}
}
