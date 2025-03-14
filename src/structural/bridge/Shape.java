package structural.bridge;

abstract class Shape {
    Colour colour;

    Shape(Colour colour) {
        this.colour = colour;
    }

    abstract void draw();
}
