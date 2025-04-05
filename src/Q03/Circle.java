
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}