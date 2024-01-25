package models;

// The Person class represents a basic entity with name, surname, and an ID.
// It implements the Comparable interface for natural ordering and the Payable interface for payment information.
public class Person implements Comparable<Person>, Payable {
    private static int nextId = 1;

    private final int id;
    private String name;
    private String surname;

    // Default constructor initializes a Person object with a unique ID.
    public Person() {
        this.id = nextId++;
    }

    // Parameterized constructor creates a Person object with a name, surname, and a unique ID.
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // Getter method for retrieving the ID of the person.
    public int getId() { return id; }

    // Getter method for retrieving the name of the person.
    public String getName() { return name; }

    // Setter method for updating the name of the person.
    public void setName(String name) { this.name = name; }

    // Getter method for retrieving the surname of the person.
    public String getSurname() { return surname; }

    // Setter method for updating the surname of the person.
    public void setSurname(String surname) { this.surname = surname; }

    // Returns a default position, which is "Student" in this case.
    public String getPosition() {
        return "Student";
    }

    // Provides a string representation of the Person object.
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // Overrides the compareTo method to provide natural ordering based on payment amounts.
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    // Implements the getPaymentAmount method required by the Payable interface.
    // In this default implementation, it returns 0, as payment amount is not defined for a generic Person.
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
