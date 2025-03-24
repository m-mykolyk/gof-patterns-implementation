package behavioral.memento;

class TextEditor {
    private String text;

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }

    TextMemento save() {
        return new TextMemento(text);
    }

    void restore(TextMemento textMemento) {
        text = textMemento.getText();
    }
}
