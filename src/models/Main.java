package models;

import java.util.ArrayList;
import java.util.Collections;

// The Main class serves as the entry point for the program.
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store instances of Person or its subclasses.
        ArrayList<Person> people = new ArrayList<>();
        // Add instances of Employee and Student to the ArrayList.
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Student("Paul", "McCartney", 3.6));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));

        // Sort the list of people based on their natural ordering defined by Person class.
        Collections.sort(people);

        // Print information about each person in the sorted list.
        printData(people);
    }

    // The printData method is responsible for printing information about people.
    // It accepts an iterable collection of Person objects.
    public static void printData(Iterable<Person> people) {
        // Iterate through the collection and print details about each person.
        for (Person p : people) {
            // Display the person's information and payment amount.
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}
