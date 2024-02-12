package by.piskunou.study.behavioral.command.impl.on;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.Stereo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
