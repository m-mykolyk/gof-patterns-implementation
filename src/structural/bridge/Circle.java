package structural.bridge;

class Circle extends Shape {
    Circle(Colour colour) {
        super(colour);
    }

    @Override
    void draw() {
        System.out.println("Drawn a circle with the next parameters:");
        colour.applyColour();
    }
}
