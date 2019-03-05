package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.customer.Address;
import seedu.address.model.customer.Customer;
import seedu.address.model.customer.Email;
<<<<<<< HEAD
=======
import seedu.address.model.customer.IdentificationNo;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Name;
import seedu.address.model.customer.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Customer objects.
 */
public class CustomerBuilder {

    public static final String DEFAULT_NAME = "Alice Pauline";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "alice@gmail.com";
<<<<<<< HEAD
=======
    public static final String DEFAULT_IDENTIFICATION_N0 = "1223453";
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";

    private Name name;
    private Phone phone;
    private Email email;
<<<<<<< HEAD
=======
    private IdentificationNo idnum;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    private Address address;
    private Set<Tag> tags;

    public CustomerBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
<<<<<<< HEAD
=======
        idnum = new IdentificationNo(DEFAULT_IDENTIFICATION_N0);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();
    }

    /**
     * Initializes the CustomerBuilder with the data of {@code customerToCopy}.
     */
    public CustomerBuilder(Customer customerToCopy) {
        name = customerToCopy.getName();
        phone = customerToCopy.getPhone();
        email = customerToCopy.getEmail();
<<<<<<< HEAD
=======
        idnum = customerToCopy.getIdNum();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        address = customerToCopy.getAddress();
        tags = new HashSet<>(customerToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Customer} that we are building.
     */
    public CustomerBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Customer} that we are building.
     */
<<<<<<< HEAD
    public CustomerBuilder withTags(String ... tags) {
=======
    public CustomerBuilder withTags(String... tags) {
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Customer} that we are building.
     */
    public CustomerBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Customer} that we are building.
     */
    public CustomerBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
<<<<<<< HEAD
=======
     * Sets the {@code IdentificationNo} of the {@code Customer} that we are building.
     */
    public CustomerBuilder withIdNum(String idnum) {
        this.idnum = new IdentificationNo(idnum);
        return this;
    }

    /**
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
     * Sets the {@code Email} of the {@code Customer} that we are building.
     */
    public CustomerBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    public Customer build() {
<<<<<<< HEAD
        return new Customer(name, phone, email, address, tags);
=======
        return new Customer(name, phone, email, idnum, address, tags);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

}
