package behavioral.template;

class PDFExporter extends DataExporter {
    @Override
    void sendData() {
        System.out.println("Wrote data in PDF format.");
    }
}
