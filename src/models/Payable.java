package models;

// The Payable interface defines a contract for classes that can provide a payment amount.
public interface Payable {
    // The getPaymentAmount method should be implemented by classes that implement this interface.
    // It returns a double representing the payment amount.
    double getPaymentAmount();
}
