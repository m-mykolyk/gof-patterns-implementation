package behavioral.command;

class TurnOnLightCommand implements Command {
    private final Light light;

    TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
