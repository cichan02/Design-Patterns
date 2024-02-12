package by.piskunou.study.behavioral.command.impl.off;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements Command {
	private Light light;

	@Override
	public void execute() {
		light.off();
	}
}
