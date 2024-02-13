package by.piskunou.study.behavioral.command;

import lombok.AllArgsConstructor;

import java.util.Collection;

@AllArgsConstructor
public class MacroCommand implements Command{
    private Collection<Command> commands;

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
