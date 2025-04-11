package behavioral.visitor;

class HtmlExportVisitor implements DocumentVisitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("&lt;p&gt;" + textElement.content() + "&lt;/p&gt;");
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("&lt;img src='" + imageElement.path() + "' /&gt;");
    }
}
