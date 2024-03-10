import circle.Circle;

public class Main {
    public static void main(String[] args) {
        //test program TestCircle to construct an instance of Circle using this

        Circle c = new Circle(3.0, "blue");

        //get color
        String color = c.getColor();
        System.out.println("Color of the circle: " + color);

        Circle c1 = new Circle(2.0); // Creating a Circle instance

        // Attempting to access radius directly
//        System.out.println(c1.radius); // Error: radius has private access in Circle
//
//        // Attempting to assign a new value to radius directly
//        c1.radius = 5.0; // Error: radius has private access in Circle

        c.setRadius(5.0);
        System.out.println("New radius: " + c.getRadius());

        c.setColor("green");
        System.out.println("New color: " + c.getColor());
    }
}