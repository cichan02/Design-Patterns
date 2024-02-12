package by.piskunou.study.behavioral.command.invoker;

import by.piskunou.study.behavioral.command.Command;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRemoteControl {
	private Command command;
 
	public void buttonWasPressed() {
		command.execute();
	}
}
