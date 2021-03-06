package seedu.address.storage;

import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.commons.util.JsonUtil;
import seedu.address.model.AddressBook;
import seedu.address.testutil.TypicalCustomers;

public class JsonSerializableAddressBookTest {

    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data", "JsonSerializableAddressBookTest");
    private static final Path TYPICAL_CUSTOMERS_FILE = TEST_DATA_FOLDER.resolve("typicalCustomersAddressBook.json");
    private static final Path INVALID_CUSTOMER_FILE = TEST_DATA_FOLDER.resolve("invalidCustomerAddressBook.json");
    private static final Path DUPLICATE_CUSTOMER_FILE = TEST_DATA_FOLDER.resolve("duplicateCustomerAddressBook.json");

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void toModelType_typicalCustomersFile_success() throws Exception {
        JsonSerializableAddressBook dataFromFile = JsonUtil.readJsonFile(TYPICAL_CUSTOMERS_FILE,
<<<<<<< HEAD
                JsonSerializableAddressBook.class).get();
=======
            JsonSerializableAddressBook.class).get();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        AddressBook addressBookFromFile = dataFromFile.toModelType();
        AddressBook typicalCustomersAddressBook = TypicalCustomers.getTypicalAddressBook();
        assertEquals(addressBookFromFile, typicalCustomersAddressBook);
    }

    @Test
    public void toModelType_invalidCustomerFile_throwsIllegalValueException() throws Exception {
        JsonSerializableAddressBook dataFromFile = JsonUtil.readJsonFile(INVALID_CUSTOMER_FILE,
<<<<<<< HEAD
                JsonSerializableAddressBook.class).get();
=======
            JsonSerializableAddressBook.class).get();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        thrown.expect(IllegalValueException.class);
        dataFromFile.toModelType();
    }

    @Test
    public void toModelType_duplicateCustomers_throwsIllegalValueException() throws Exception {
        JsonSerializableAddressBook dataFromFile = JsonUtil.readJsonFile(DUPLICATE_CUSTOMER_FILE,
<<<<<<< HEAD
                JsonSerializableAddressBook.class).get();
=======
            JsonSerializableAddressBook.class).get();
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        thrown.expect(IllegalValueException.class);
        thrown.expectMessage(JsonSerializableAddressBook.MESSAGE_DUPLICATE_CUSTOMER);
        dataFromFile.toModelType();
    }

}
