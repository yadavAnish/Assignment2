package employee;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 50000.0);
        emp1.displayInfo();

        emp1.raiseSalary(10); // Increase salary by 10%
        emp1.displayInfo();

        emp1.setName("John Smith"); // Change name
        emp1.displayInfo();


    }
}
