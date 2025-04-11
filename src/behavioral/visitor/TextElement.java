package behavioral.visitor;

record TextElement(String content) implements DocumentElement {
    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
