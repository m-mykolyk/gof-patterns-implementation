package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColour());
        Shape blueRectangle = new Rectangle(new BlueColour());

        redCircle.draw();
        blueRectangle.draw();
    }
}
