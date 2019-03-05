package seedu.address.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
<<<<<<< HEAD
=======
import seedu.address.model.booking.Booking;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;

/**
 * An Immutable AddressBook that is serializable to JSON format.
 */
@JsonRootName(value = "addressbook")
class JsonSerializableAddressBook {

    public static final String MESSAGE_DUPLICATE_CUSTOMER = "Customers list contains duplicate customer(s).";

<<<<<<< HEAD
=======
    private final List<JsonAdaptedBooking> bookings = new ArrayList<>();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    private final List<JsonAdaptedCustomer> customers = new ArrayList<>();

    /**
     * Constructs a {@code JsonSerializableAddressBook} with the given customers.
     */
    @JsonCreator
<<<<<<< HEAD
    public JsonSerializableAddressBook(@JsonProperty("customers") List<JsonAdaptedCustomer> customers) {
        this.customers.addAll(customers);
=======
    public JsonSerializableAddressBook(@JsonProperty("customers") List<JsonAdaptedCustomer> customers,
                                       @JsonProperty("bookings") List<JsonAdaptedBooking> bookings) {
        this.customers.addAll(customers);
        this.bookings.addAll(bookings);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    /**
     * Converts a given {@code ReadOnlyAddressBook} into this class for Jackson use.
     *
     * @param source future changes to this will not affect the created {@code JsonSerializableAddressBook}.
     */
    public JsonSerializableAddressBook(ReadOnlyAddressBook source) {
        customers.addAll(source.getCustomerList().stream().map(JsonAdaptedCustomer::new).collect(Collectors.toList()));
<<<<<<< HEAD
=======
        bookings.addAll(source.getBookingList().stream().map(JsonAdaptedBooking::new).collect(Collectors.toList()));
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    /**
     * Converts this address book into the model's {@code AddressBook} object.
     *
     * @throws IllegalValueException if there were any data constraints violated.
     */
    public AddressBook toModelType() throws IllegalValueException {
        AddressBook addressBook = new AddressBook();
        for (JsonAdaptedCustomer jsonAdaptedCustomer : customers) {
            Customer customer = jsonAdaptedCustomer.toModelType();
            if (addressBook.hasCustomer(customer)) {
                throw new IllegalValueException(MESSAGE_DUPLICATE_CUSTOMER);
            }
            addressBook.addCustomer(customer);
<<<<<<< HEAD
=======
        }
        for (JsonAdaptedBooking jsonAdaptedBooking : bookings) {
            Booking booking = jsonAdaptedBooking.toModelType();
            addressBook.addBooking(booking);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        }
        return addressBook;
    }

}
