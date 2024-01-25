package models;

// The Student class is a subclass of Person and represents a student with a GPA.
public class Student extends Person {
    private double gpa;

    // Default constructor creates a Student object with default values.
    public Student() {
        super();
    }

    // Parameterized constructor creates a Student object with a name, surname, and GPA.
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // Getter method for retrieving the GPA of the student.
    public double getGpa() {
        return gpa;
    }

    // Setter method for updating the GPA of the student.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Overrides the toString method to provide a custom string representation for a Student.
    // It includes the "Student: " prefix before the standard Person representation.
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Implements the getPaymentAmount method required by the Payable interface.
    // It calculates the payment amount based on the student's GPA:
    // - If GPA is greater than 2.67, returns 36660.00.
    // - Otherwise, returns 0.
    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.00 : 0;
    }
}
