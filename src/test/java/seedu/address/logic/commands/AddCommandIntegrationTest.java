package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalCustomers.getTypicalAddressBook;

import org.junit.Before;
import org.junit.Test;

import seedu.address.logic.CommandHistory;
import seedu.address.model.CustomerManager;
import seedu.address.model.CustomerModel;
import seedu.address.model.UserPrefs;
<<<<<<< HEAD
=======
import seedu.address.model.VersionedAddressBook;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;
import seedu.address.testutil.CustomerBuilder;

/**
 * Contains integration tests (interaction with the Model) for {@code AddCommand}.
 */
public class AddCommandIntegrationTest {

    private CustomerModel model;
    private CommandHistory commandHistory = new CommandHistory();

    @Before
    public void setUp() {
        model = new CustomerManager(new VersionedAddressBook(getTypicalAddressBook()), new UserPrefs());
    }

    @Test
    public void execute_newCustomer_success() {
        Customer validCustomer = new CustomerBuilder().build();

<<<<<<< HEAD
        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
=======
        CustomerModel expectedModel = new CustomerManager((VersionedAddressBook) model.getAddressBook(),
            new UserPrefs());
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        expectedModel.addCustomer(validCustomer);
        expectedModel.commitAddressBook();

        assertCommandSuccess(new AddCommand(validCustomer), model, commandHistory,
<<<<<<< HEAD
                String.format(AddCommand.MESSAGE_SUCCESS, validCustomer), expectedModel);
=======
            String.format(AddCommand.MESSAGE_SUCCESS, validCustomer), expectedModel);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    @Test
    public void execute_duplicateCustomer_throwsCommandException() {
        Customer customerInList = model.getAddressBook().getCustomerList().get(0);
        assertCommandFailure(new AddCommand(customerInList), model, commandHistory,
<<<<<<< HEAD
                AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
=======
            AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

}
