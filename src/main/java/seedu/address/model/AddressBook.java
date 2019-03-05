package seedu.address.model;

import static java.util.Objects.requireNonNull;

import java.util.List;

import javafx.beans.InvalidationListener;
import javafx.collections.ObservableList;
import seedu.address.commons.util.InvalidationListenerManager;
<<<<<<< HEAD
=======
import seedu.address.model.booking.Booking;
import seedu.address.model.booking.BookingList;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;
import seedu.address.model.customer.UniqueCustomerList;

/**
 * Wraps all data at the address-book level
 * Duplicates are not allowed (by .isSameCustomer comparison)
 */
public class AddressBook implements ReadOnlyAddressBook {

<<<<<<< HEAD
=======
    private final BookingList bookings;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    private final UniqueCustomerList customers;
    private final InvalidationListenerManager invalidationListenerManager = new InvalidationListenerManager();

    /**
     * The 'unusual' code block below is an non-static initialization block, sometimes used to avoid duplication
     * between constructors. See https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
     *
     * Note that non-static init blocks are not recommended to use. There are other ways to avoid duplication
     *   among constructors.
     */
    {
<<<<<<< HEAD
=======
        bookings = new BookingList();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        customers = new UniqueCustomerList();
    }

    public AddressBook() {
    }

    /**
     * Creates an AddressBook using the Customers in the {@code toBeCopied}
     */
    public AddressBook(ReadOnlyAddressBook toBeCopied) {
        this();
        resetData(toBeCopied);
    }

    //// list overwrite operations

    /**
     * Replaces the contents of the customer list with {@code customers}.
     * {@code customers} must not contain duplicate customers.
<<<<<<< HEAD
     */
    public void setCustomers(List<Customer> customers) {
        this.customers.setCustomers(customers);
=======
     */
    public void setCustomers(List<Customer> customers) {
        this.customers.setCustomers(customers);
        indicateModified();
    }

    /**
     * Replaces the contents of the booking list with {@code bookings}.
     */
    public void setBookings(List<Booking> bookings) {
        this.bookings.setBookings(bookings);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        indicateModified();
    }

    /**
     * Resets the existing data of this {@code AddressBook} with {@code newData}.
     */
    public void resetData(ReadOnlyAddressBook newData) {
        requireNonNull(newData);

        setCustomers(newData.getCustomerList());
<<<<<<< HEAD
=======
        setBookings(newData.getBookingList());
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    //// customer-level operations

    /**
     * Returns true if a customer with the same identity as {@code customer} exists in the address book.
     */
    public boolean hasCustomer(Customer customer) {
        requireNonNull(customer);
        return customers.contains(customer);
    }

    /**
     * Adds a customer to the address book.
     * The customer must not already exist in the address book.
     */
    public void addCustomer(Customer p) {
        customers.add(p);
        indicateModified();
    }

    /**
     * Replaces the given customer {@code target} in the list with {@code editedCustomer}.
     * {@code target} must exist in the address book.
     * The customer identity of {@code editedCustomer} must not be the same as
     * another existing customer in the address book.
<<<<<<< HEAD
     */
    public void setCustomer(Customer target, Customer editedCustomer) {
        requireNonNull(editedCustomer);

        customers.setCustomer(target, editedCustomer);
=======
     */
    public void setCustomer(Customer target, Customer editedCustomer) {
        requireNonNull(editedCustomer);

        customers.setCustomer(target, editedCustomer);
        indicateModified();
    }

    /**
     * Removes {@code key} from this {@code AddressBook}.
     * {@code key} must exist in the address book.
     */
    public void removeCustomer(Customer key) {
        customers.remove(key);
        indicateModified();
    }

    //// booking-level operations

    /**
     * Adds a booking to the address book.
     */
    public void addBooking(Booking p) {
        bookings.add(p);
        indicateModified();
    }

    /**
     * Replaces the booking at the given {@code bookingIndex} in the list with {@code editedBooking}.
     * {@code bookingIndex} must be within the list of bookings.
     */
    public void setBooking(int bookingIndex, Booking editedBooking) {
        requireNonNull(editedBooking);

        bookings.setBooking(bookingIndex, editedBooking);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        indicateModified();
    }

    /**
     * Removes {@code key} from this {@code AddressBook}.
     * {@code key} must exist in the address book.
     */
<<<<<<< HEAD
    public void removeCustomer(Customer key) {
        customers.remove(key);
=======
    public void removeBooking(int removeIndex) {
        bookings.remove(removeIndex);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        indicateModified();
    }

    @Override
    public void addListener(InvalidationListener listener) {
        invalidationListenerManager.addListener(listener);
    }

    @Override
    public void removeListener(InvalidationListener listener) {
        invalidationListenerManager.removeListener(listener);
    }

    /**
     * Notifies listeners that the address book has been modified.
     */
    protected void indicateModified() {
        invalidationListenerManager.callListeners(this);
    }

    //// util methods

    @Override
    public ObservableList<Booking> getBookingList() {
        return bookings.asUnmodifiableObservableList();
    }

    /**
     * Return a string to represent the address book.
     */
    public String toString() {
        return customers.asUnmodifiableObservableList().size() + " customers";
        // TODO: refine later
    }

    @Override
    public ObservableList<Customer> getCustomerList() {
        return customers.asUnmodifiableObservableList();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
<<<<<<< HEAD
                || (other instanceof AddressBook // instanceof handles nulls
                && customers.equals(((AddressBook) other).customers));
=======
            || (other instanceof AddressBook // instanceof handles nulls
            && customers.equals(((AddressBook) other).customers)
            && bookings.equals(((AddressBook) other).bookings));
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    @Override
    public int hashCode() {
        return customers.hashCode();
    }
}
