package behavioral.visitor;

record ImageElement(String path) implements DocumentElement {
    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);

    }
}
