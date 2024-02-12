package by.piskunou.study.behavioral.command.impl.on;

import by.piskunou.study.behavioral.command.Command;
import by.piskunou.study.behavioral.command.receiver.Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOnCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
