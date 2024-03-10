package circle;

public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;  // default radius
        this.color = "red"; // default color
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // default color
    }

    // Third constructor with two arguments
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }
    // toString method
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
