package by.piskunou.study.behavioral.command.impl.off;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.Stereo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOffCommand implements Command {
	private Stereo stereo;

	@Override
	public void execute() {
		stereo.off();
	}
}
