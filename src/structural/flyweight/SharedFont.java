package structural.flyweight;

class SharedFont implements Font{
    private final String fontName;

    public SharedFont(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public void applyFont(String text) {
        System.out.println("Applied font: " + fontName + " to text: " + text);
    }
}
