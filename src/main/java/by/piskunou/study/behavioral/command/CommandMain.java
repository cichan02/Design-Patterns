package by.piskunou.study.behavioral.command;

import by.piskunou.study.Main;
import by.piskunou.study.behavioral.command.impl.on.StereoOnWithCDCommand;
import by.piskunou.study.behavioral.command.invoker.RemoteControl;
import by.piskunou.study.behavioral.command.receiver.CeilingFan;
import by.piskunou.study.behavioral.command.receiver.GarageDoor;
import by.piskunou.study.behavioral.command.receiver.Light;
import by.piskunou.study.behavioral.command.receiver.Stereo;

public class CommandMain implements Main {
    @Override
    public void start() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(4, garageDoor::up, garageDoor::down);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
