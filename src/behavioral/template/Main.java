package behavioral.template;

public class Main {
    public static void main(String[] args) {
        DataExporter pdfExporter = new PDFExporter();
        DataExporter csvExporter = new CSVExporter();

        System.out.println("PDF file export:");
        pdfExporter.export();

        System.out.println("CSV file export:");
        csvExporter.export();
    }
}
