package by.piskunou.study.behavioral.command.impl.on;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.CeilingFan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CeilingFanOnCommand implements Command {
	private CeilingFan ceilingFan;

	@Override
	public void execute() {
		ceilingFan.high();
	}
}
