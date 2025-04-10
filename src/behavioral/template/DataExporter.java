package behavioral.template;

abstract class DataExporter {
    final void export() {
        openFile();
        sendData();
        closeFile();
    }

    void openFile() {
        System.out.println("File opened.");
    }

    abstract void sendData();

    void closeFile() {
        System.out.println("File closed.");
    }
}
