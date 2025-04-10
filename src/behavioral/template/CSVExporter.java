package behavioral.template;

class CSVExporter extends DataExporter {
    @Override
    void sendData() {
        System.out.println("Wrote data in CSV format.");
    }
}
