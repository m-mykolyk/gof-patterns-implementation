package behavioral.visitor;

interface DocumentElement {
    void accept(DocumentVisitor documentVisitor);
}
