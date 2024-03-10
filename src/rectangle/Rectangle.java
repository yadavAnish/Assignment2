package rectangle;
public class Rectangle {
    // Private instance variables
    private float length;
    private float width;

    // Constructors
    public Rectangle() {
        this.length = 1.0f;  // default length
        this.width = 1.0f;   // default width
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate area
    public float getArea() {
        return length * width;
    }
}

