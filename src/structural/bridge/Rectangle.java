package structural.bridge;

class Rectangle extends  Shape {
    Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    void draw() {
        System.out.println("Drawn a circle with the next parameters:");
        colour.applyColour();
    }
}
