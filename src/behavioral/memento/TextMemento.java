package behavioral.memento;

class TextMemento {
    private final String text;

    TextMemento(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}
