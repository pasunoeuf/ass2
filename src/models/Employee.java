package models;

// Employee class represents an employee with a name, surname, position, and salary.
public class Employee extends Person {
    private String position;   // The position of the employee.
    private double salary;     // The salary of the employee.

    // Default constructor for Employee.
    public Employee() {
        super();  // Calls the default constructor of the superclass (Person).
    }

    // Parameterized constructor for Employee.
    // Parameters:
    //   - name: The name of the employee.
    //   - surname: The surname of the employee.
    //   - position: The position held by the employee.
    //   - salary: The salary of the employee.
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);  // Calls the parameterized constructor of the superclass (Person).
        this.position = position;
        this.salary = salary;
    }

    // Getter method for retrieving the position of the employee.
    // Returns: The position of the employee as a String.
    public String getPosition() {
        return position;
    }

    // Setter method for setting the position of the employee.
    // Parameters:
    //   - position: The new position to be set for the employee.
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter method for retrieving the salary of the employee.
    // Returns: The salary of the employee as a double.
    public double getSalary() {
        return salary;
    }

    // Setter method for setting the salary of the employee.
    // Parameters:
    //   - salary: The new salary to be set for the employee.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overrides the toString method to provide a custom string representation of the Employee.
    // Returns: A String representing the Employee.
    @Override
    public String toString() {
        return "Employee: " + super.toString();  // Calls the toString method of the superclass (Person).
    }

    // Overrides the getPaymentAmount method to specify the payment amount for the employee.
    // Returns: The salary of the employee as a double.
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
