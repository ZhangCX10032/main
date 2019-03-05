package seedu.address.storage;

import static org.junit.Assert.assertEquals;
import static seedu.address.storage.JsonAdaptedCustomer.MISSING_FIELD_MESSAGE_FORMAT;
import static seedu.address.testutil.TypicalCustomers.BENSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.customer.Address;
import seedu.address.model.customer.Email;
<<<<<<< HEAD
=======
import seedu.address.model.customer.IdentificationNo;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Name;
import seedu.address.model.customer.Phone;
import seedu.address.testutil.Assert;

public class JsonAdaptedCustomerTest {
    private static final String INVALID_NAME = "R@chel";
    private static final String INVALID_PHONE = "+651234";
    private static final String INVALID_ADDRESS = " ";
    private static final String INVALID_EMAIL = "example.com";
<<<<<<< HEAD
=======
    private static final String INVALID_IDENTIFICATION_NO = "Z51234";
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    private static final String INVALID_TAG = "#friend";

    private static final String VALID_NAME = BENSON.getName().toString();
    private static final String VALID_PHONE = BENSON.getPhone().toString();
    private static final String VALID_EMAIL = BENSON.getEmail().toString();
<<<<<<< HEAD
    private static final String VALID_ADDRESS = BENSON.getAddress().toString();
    private static final List<JsonAdaptedTag> VALID_TAGS = BENSON.getTags().stream()
            .map(JsonAdaptedTag::new)
            .collect(Collectors.toList());
=======
    private static final String VALID_IDENTIFICATION_NO = BENSON.getIdNum().toString();
    private static final String VALID_ADDRESS = BENSON.getAddress().toString();
    private static final List<JsonAdaptedTag> VALID_TAGS = BENSON.getTags().stream()
        .map(JsonAdaptedTag::new)
        .collect(Collectors.toList());
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c

    @Test
    public void toModelTypeValidCustomerDetailsReturnsCustomer() throws Exception {
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(BENSON);
        assertEquals(BENSON, customer.toModelType());
    }

    @Test
    public void toModelTypeInvalidNameThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
<<<<<<< HEAD
                new JsonAdaptedCustomer(INVALID_NAME, VALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_TAGS);
=======
            new JsonAdaptedCustomer(INVALID_NAME, VALID_PHONE, VALID_EMAIL, VALID_IDENTIFICATION_NO, VALID_ADDRESS,
                VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = Name.MESSAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeNullNameThrowsIllegalValueException() {
<<<<<<< HEAD
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(null, VALID_PHONE, VALID_EMAIL, VALID_ADDRESS,
                VALID_TAGS);
=======
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(null, VALID_PHONE, VALID_EMAIL,
            VALID_IDENTIFICATION_NO, VALID_ADDRESS, VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Name.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeInvalidPhoneThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
<<<<<<< HEAD
                new JsonAdaptedCustomer(VALID_NAME, INVALID_PHONE, VALID_EMAIL, VALID_ADDRESS, VALID_TAGS);
=======
            new JsonAdaptedCustomer(VALID_NAME, INVALID_PHONE, VALID_EMAIL, VALID_IDENTIFICATION_NO, VALID_ADDRESS,
                VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = Phone.MESSAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeNullPhoneThrowsIllegalValueException() {
<<<<<<< HEAD
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(VALID_NAME, null, VALID_EMAIL, VALID_ADDRESS,
                VALID_TAGS);
=======
        JsonAdaptedCustomer customer =
            new JsonAdaptedCustomer(VALID_NAME, null, VALID_EMAIL, VALID_IDENTIFICATION_NO,
                VALID_ADDRESS, VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Phone.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeInvalidEmailThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
<<<<<<< HEAD
                new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, INVALID_EMAIL, VALID_ADDRESS, VALID_TAGS);
=======
            new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, INVALID_EMAIL, VALID_IDENTIFICATION_NO, VALID_ADDRESS,
                VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = Email.MESSAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeNullEmailThrowsIllegalValueException() {
<<<<<<< HEAD
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, null, VALID_ADDRESS,
=======
        JsonAdaptedCustomer customer =
            new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, null, VALID_IDENTIFICATION_NO, VALID_ADDRESS,
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
                VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Email.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
<<<<<<< HEAD
    public void toModelTypeInvalidAddressThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
                new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, INVALID_ADDRESS, VALID_TAGS);
=======
    public void toModelTypeInvalidIdentificationNoThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
            new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, INVALID_IDENTIFICATION_NO, VALID_ADDRESS,
                VALID_TAGS);
        String expectedMessage = IdentificationNo.MESSAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeNullIdentificationNoThrowsIllegalValueException() {
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, null,
            VALID_ADDRESS,
            VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, IdentificationNo.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeInvalidAddressThrowsIllegalValueException() {
        JsonAdaptedCustomer customer =
            new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, VALID_IDENTIFICATION_NO, INVALID_ADDRESS,
                VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = Address.MESSAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeNullAddressThrowsIllegalValueException() {
<<<<<<< HEAD
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, null, VALID_TAGS);
=======
        JsonAdaptedCustomer customer = new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL,
            VALID_IDENTIFICATION_NO, null, VALID_TAGS);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Address.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, customer::toModelType);
    }

    @Test
    public void toModelTypeInvalidTagsThrowsIllegalValueException() {
        List<JsonAdaptedTag> invalidTags = new ArrayList<>(VALID_TAGS);
        invalidTags.add(new JsonAdaptedTag(INVALID_TAG));
        JsonAdaptedCustomer customer =
<<<<<<< HEAD
                new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, VALID_ADDRESS, invalidTags);
=======
            new JsonAdaptedCustomer(VALID_NAME, VALID_PHONE, VALID_EMAIL, VALID_IDENTIFICATION_NO, VALID_ADDRESS,
                invalidTags);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        Assert.assertThrows(IllegalValueException.class, customer::toModelType);
    }

}
