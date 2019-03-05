package seedu.address.model;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
<<<<<<< HEAD
=======
import seedu.address.model.booking.Booking;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook extends Observable {

    /**
     * Returns an unmodifiable view of the customers list.
     * This list will not contain any duplicate customers.
     */
    ObservableList<Customer> getCustomerList();

    /**
     * Returns an unmodifiable view of the bookings list.
     */
    ObservableList<Booking> getBookingList();
}
