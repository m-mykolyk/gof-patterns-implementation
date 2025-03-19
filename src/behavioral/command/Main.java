package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);

        RemoteControl remoteControl  = new RemoteControl();

        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();
        remoteControl.pressUndo();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
}
