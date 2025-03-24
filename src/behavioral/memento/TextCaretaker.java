package behavioral.memento;

import java.util.Stack;

class TextCaretaker {
    private final Stack<TextMemento> textHistory = new Stack<>();

    void save(TextEditor textEditor) {
        textHistory.push(textEditor.save());
    }

    void undo(TextEditor textEditor) {
        if(!textHistory.isEmpty()) {
            TextMemento textMemento = textHistory.pop();
            textEditor.restore(textMemento);
        } else {
            System.out.println("ERROR: No more undo steps available!");
        }
    }
}
