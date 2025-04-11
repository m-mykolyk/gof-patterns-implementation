package behavioral.visitor;

class RenderVisitor implements DocumentVisitor {
    @Override
    public void visit(TextElement textElement) {
        System.out.println("Rendered text: " + textElement.content());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Rendered image: " + imageElement.path());
    }
}
