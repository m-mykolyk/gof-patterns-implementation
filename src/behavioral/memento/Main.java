package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextCaretaker textCaretaker = new TextCaretaker();

        textEditor.setText("Version 1");
        textCaretaker.save(textEditor);
        System.out.println("Current Text: " + textEditor.getText());

        textEditor.setText("Version 2");
        textCaretaker.save(textEditor);
        System.out.println("Current Text: " + textEditor.getText());

        textEditor.setText("Version 3");
        System.out.println("Current Text: " + textEditor.getText());

        textCaretaker.undo(textEditor);
        System.out.println("After Undo 1: " + textEditor.getText());

        textCaretaker.undo(textEditor);
        System.out.println("After Undo 2: " + textEditor.getText());

        textCaretaker.undo(textEditor);
        System.out.println("After Undo 3: " + textEditor.getText());
    }
}
