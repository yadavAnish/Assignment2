package rectangle;
import rectangle.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle(); // Create a rectangle with default length and width
        Rectangle rect2 = new Rectangle(3.0f, 4.0f); // Create a rectangle with specified length and width

        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Area of rect2: " + rect2.getArea());

        rect1.setLength(5.0f); // Change the length of rect1
        rect1.setWidth(2.0f); // Change the width of rect1

        System.out.println("New area of rect1: " + rect1.getArea());

    }
}
