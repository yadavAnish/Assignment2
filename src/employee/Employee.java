package employee;

public class Employee {
    // Private instance variables
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100.0);
        salary += raiseAmount;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
