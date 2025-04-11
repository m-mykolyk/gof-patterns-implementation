package behavioral.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> elements = List.of(
                new TextElement("Hello, Visitor!"),
                new ImageElement("/img/logo.png")
        );

        DocumentVisitor renderer = new RenderVisitor();
        DocumentVisitor htmlExporter = new HtmlExportVisitor();

        System.out.println("== Rendering ==");
        for (DocumentElement element : elements) {
            element.accept(renderer);
        }

        System.out.println("\n== Exporting to HTML ==");
        for (DocumentElement element : elements) {
            element.accept(htmlExporter);
        }
    }
}
