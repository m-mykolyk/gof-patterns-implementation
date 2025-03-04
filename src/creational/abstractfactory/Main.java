package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        guiFactory = new WindowsFactory();
        Button windowsButton = guiFactory.createButton();
        Checkbox windowsCheckbox = guiFactory.createCheckbox();
        windowsButton.render();
        windowsCheckbox.check();

        guiFactory = new MacOSFactory();
        Button macOSButton = guiFactory.createButton();
        Checkbox macOSCheckBox = guiFactory.createCheckbox();
        macOSButton.render();
        macOSCheckBox.check();
    }
}
