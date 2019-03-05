package seedu.address.testutil;

import seedu.address.model.AddressBook;
import seedu.address.model.customer.Customer;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
<<<<<<< HEAD
 *     {@code AddressBook ab = new AddressBookBuilder().withCustomer("John", "Doe").build();}
=======
 * {@code AddressBook ab = new AddressBookBuilder().withCustomer("John", "Doe").build();}
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
 */
public class AddressBookBuilder {

    private AddressBook addressBook;

    public AddressBookBuilder() {
        addressBook = new AddressBook();
    }

    public AddressBookBuilder(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * Adds a new {@code Customer} to the {@code AddressBook} that we are building.
     */
    public AddressBookBuilder withCustomer(Customer customer) {
        addressBook.addCustomer(customer);
        return this;
    }

    public AddressBook build() {
        return addressBook;
    }
}
