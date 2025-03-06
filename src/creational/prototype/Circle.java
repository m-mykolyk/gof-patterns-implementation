package creational.prototype;

class Circle implements Prototype {
    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }

    void displayCircle() {
        System.out.println("Circle with radius: " + radius);
    }
}
