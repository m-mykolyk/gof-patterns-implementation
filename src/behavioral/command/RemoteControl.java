package behavioral.command;

class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }

    void pressUndo() {
        command.undo();
    }
}
