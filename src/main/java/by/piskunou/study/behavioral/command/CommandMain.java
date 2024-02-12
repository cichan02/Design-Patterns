package by.piskunou.study.behavioral.command;

import by.piskunou.study.Main;
import by.piskunou.study.behavioral.command.impl.off.CeilingFanOffCommand;
import by.piskunou.study.behavioral.command.impl.off.GarageDoorDownCommand;
import by.piskunou.study.behavioral.command.impl.off.LightOffCommand;
import by.piskunou.study.behavioral.command.impl.off.StereoOffCommand;
import by.piskunou.study.behavioral.command.impl.on.CeilingFanOnCommand;
import by.piskunou.study.behavioral.command.impl.on.GarageDoorUpCommand;
import by.piskunou.study.behavioral.command.impl.on.LightOnCommand;
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

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

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
