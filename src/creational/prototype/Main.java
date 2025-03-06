package creational.prototype;

public class Main {
    public static void main(String[] args) {
        int radius = 10;

        Circle originalCircle = new Circle(radius);
        Circle cloneCircle = (Circle) originalCircle.clone();

        originalCircle.displayCircle();
        cloneCircle.displayCircle();
    }
}
