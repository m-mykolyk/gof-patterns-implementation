package behavioral.visitor;

interface DocumentVisitor {
    void visit(TextElement textElement);

    void visit(ImageElement imageElement);
}
