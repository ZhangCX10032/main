package systemtests;

<<<<<<< HEAD
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.ID_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.ID_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ADDRESS_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_EMAIL_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ID_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_TAG_DESC;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ID_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;
import static seedu.address.testutil.TypicalCustomers.ALICE;
import static seedu.address.testutil.TypicalCustomers.AMY;
import static seedu.address.testutil.TypicalCustomers.BOB;
import static seedu.address.testutil.TypicalCustomers.CARL;
import static seedu.address.testutil.TypicalCustomers.HOON;
import static seedu.address.testutil.TypicalCustomers.IDA;
import static seedu.address.testutil.TypicalCustomers.KEYWORD_MATCHING_MEIER;

import org.junit.Test;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.AddCommand;
<<<<<<< HEAD
import seedu.address.logic.commands.RedoCommand;
import seedu.address.logic.commands.UndoCommand;
import seedu.address.model.Model;
import seedu.address.model.customer.Address;
import seedu.address.model.customer.Customer;
import seedu.address.model.customer.Email;
=======
import seedu.address.model.CustomerModel;
import seedu.address.model.customer.Customer;
import seedu.address.model.customer.Email;
import seedu.address.model.customer.IdentificationNo;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Name;
import seedu.address.model.customer.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.testutil.CustomerBuilder;
import seedu.address.testutil.CustomerUtil;
=======
//import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
//import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_AMY;
//import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_AMY;
//import static seedu.address.logic.commands.CommandTestUtil.EMAIL_DESC_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.ID_DESC_AMY;
//import static seedu.address.logic.commands.CommandTestUtil.ID_DESC_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_ADDRESS_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_EMAIL_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_ID_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.INVALID_TAG_DESC;
//import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_AMY;
//import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
//import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_FRIEND;
//import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_HUSBAND;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_ID_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
//import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
//import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;
//import static seedu.address.testutil.TypicalCustomers.ALICE;
//import static seedu.address.testutil.TypicalCustomers.AMY;
//import static seedu.address.testutil.TypicalCustomers.BOB;
//import static seedu.address.testutil.TypicalCustomers.CARL;
//import static seedu.address.testutil.TypicalCustomers.HOON;
//import static seedu.address.testutil.TypicalCustomers.IDA;
//import static seedu.address.testutil.TypicalCustomers.KEYWORD_MATCHING_MEIER;
//
//import org.junit.Test;
//
//import seedu.address.commons.core.Messages;
//import seedu.address.commons.core.index.Index;
//import seedu.address.logic.commands.AddCommand;
import seedu.address.model.CustomerModel;
//import seedu.address.model.customer.Customer;
//import seedu.address.model.customer.Email;
//import seedu.address.model.customer.IdentificationNo;
//import seedu.address.model.customer.Name;
//import seedu.address.model.customer.Phone;
//import seedu.address.model.tag.Tag;
//import seedu.address.testutil.CustomerBuilder;
//import seedu.address.testutil.CustomerUtil;
>>>>>>> 19116c6b0ee10bb254ad70d84cc773ce75d25e48

public class AddCommandSystemTest extends AddressBookSystemTest {
<<<<<<< HEAD

    @Test
    public void add() {
        Model model = getModel();

        /* ------------------------ Perform add operations on the shown unfiltered list ----------------------------- */

        /* Case: add a customer without tags to a non-empty address book, command with leading spaces and trailing
         * spaces
         * -> added
         */
        Customer toAdd = AMY;
        String command = "   " + AddCommand.COMMAND_WORD + "  " + NAME_DESC_AMY + "  " + PHONE_DESC_AMY + " "
                + EMAIL_DESC_AMY + "   " + ADDRESS_DESC_AMY + "   " + TAG_DESC_FRIEND + " ";
        assertCommandSuccess(command, toAdd);

        /* Case: undo adding Amy to the list -> Amy deleted */
        command = UndoCommand.COMMAND_WORD;
        String expectedResultMessage = UndoCommand.MESSAGE_SUCCESS;
        assertCommandSuccess(command, model, expectedResultMessage);

        /* Case: redo adding Amy to the list -> Amy added again */
        command = RedoCommand.COMMAND_WORD;
        model.addCustomer(toAdd);
        expectedResultMessage = RedoCommand.MESSAGE_SUCCESS;
        assertCommandSuccess(command, model, expectedResultMessage);

        /* Case: add a customer with all fields same as another customer in the address book except name -> added */
        toAdd = new CustomerBuilder(AMY).withName(VALID_NAME_BOB).build();
        command = AddCommand.COMMAND_WORD + NAME_DESC_BOB + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
                + TAG_DESC_FRIEND;
        assertCommandSuccess(command, toAdd);

        /* Case: add a customer with all fields same as another customer in the address book except phone and email
         * -> added
         */
        toAdd = new CustomerBuilder(AMY).withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).build();
        command = CustomerUtil.getAddCommand(toAdd);
        assertCommandSuccess(command, toAdd);

        /* Case: add to empty address book -> added */
        deleteAllCustomers();
        assertCommandSuccess(ALICE);

        /* Case: add a customer with tags, command with parameters in random order -> added */
        toAdd = BOB;
        command = AddCommand.COMMAND_WORD + TAG_DESC_FRIEND + PHONE_DESC_BOB + ADDRESS_DESC_BOB + NAME_DESC_BOB
                + TAG_DESC_HUSBAND + EMAIL_DESC_BOB;
        assertCommandSuccess(command, toAdd);

        /* Case: add a customer, missing tags -> added */
        assertCommandSuccess(HOON);

        /* -------------------------- Perform add operation on the shown filtered list ------------------------------ */

        /* Case: filters the customer list before adding -> added */
        showCustomersWithName(KEYWORD_MATCHING_MEIER);
        assertCommandSuccess(IDA);

        /* ------------------------ Perform add operation while a customer card is selected ------------------------- */

        /* Case: selects first card in the customer list, add a customer -> added, card selection remains unchanged */
        selectCustomer(Index.fromOneBased(1));
        assertCommandSuccess(CARL);

        /* ----------------------------------- Perform invalid add operations --------------------------------------- */

        /* Case: add a duplicate customer -> rejected */
        command = CustomerUtil.getAddCommand(HOON);
        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);

        /* Case: add a duplicate customer except with different phone -> rejected */
        toAdd = new CustomerBuilder(HOON).withPhone(VALID_PHONE_BOB).build();
        command = CustomerUtil.getAddCommand(toAdd);
        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);

        /* Case: add a duplicate customer except with different email -> rejected */
        toAdd = new CustomerBuilder(HOON).withEmail(VALID_EMAIL_BOB).build();
        command = CustomerUtil.getAddCommand(toAdd);
        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);

        /* Case: add a duplicate customer except with different address -> rejected */
        toAdd = new CustomerBuilder(HOON).withAddress(VALID_ADDRESS_BOB).build();
        command = CustomerUtil.getAddCommand(toAdd);
        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);

        /* Case: add a duplicate customer except with different tags -> rejected */
        command = CustomerUtil.getAddCommand(HOON) + " " + PREFIX_TAG.getPrefix() + "friends";
        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);

        /* Case: missing name -> rejected */
        command = AddCommand.COMMAND_WORD + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));

        /* Case: missing phone -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));

        /* Case: missing email -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + ADDRESS_DESC_AMY;
        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));

        /* Case: missing address -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY;
        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));

        /* Case: invalid keyword -> rejected */
        command = "adds " + CustomerUtil.getCustomerDetails(toAdd);
        assertCommandFailure(command, Messages.MESSAGE_UNKNOWN_COMMAND);

        /* Case: invalid name -> rejected */
        command = AddCommand.COMMAND_WORD + INVALID_NAME_DESC + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
        assertCommandFailure(command, Name.MESSAGE_CONSTRAINTS);

        /* Case: invalid phone -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + INVALID_PHONE_DESC + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
        assertCommandFailure(command, Phone.MESSAGE_CONSTRAINTS);

        /* Case: invalid email -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + INVALID_EMAIL_DESC + ADDRESS_DESC_AMY;
        assertCommandFailure(command, Email.MESSAGE_CONSTRAINTS);

        /* Case: invalid address -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY + INVALID_ADDRESS_DESC;
        assertCommandFailure(command, Address.MESSAGE_CONSTRAINTS);

        /* Case: invalid tag -> rejected */
        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
                + INVALID_TAG_DESC;
        assertCommandFailure(command, Tag.MESSAGE_CONSTRAINTS);
    }

    /**
     * Executes the {@code AddCommand} that adds {@code toAdd} to the model and asserts that the,<br>
     * 1. Command box displays an empty string.<br>
     * 2. Command box has the default style class.<br>
     * 3. Result display box displays the success message of executing {@code AddCommand} with the details of
     * {@code toAdd}.<br>
     * 4. {@code Storage} and {@code CustomerListPanel} equal to the corresponding components in
     * the current model added with {@code toAdd}.<br>
     * 5. Browser url and selected card remain unchanged.<br>
     * 6. Status bar's sync status changes.<br>
     * Verifications 1, 3 and 4 are performed by
     * {@code AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)}.<br>
     * @see AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)
     */
    private void assertCommandSuccess(Customer toAdd) {
        assertCommandSuccess(CustomerUtil.getAddCommand(toAdd), toAdd);
    }

    /**
     * Performs the same verification as {@code assertCommandSuccess(Customer)}. Executes {@code command}
     * instead.
     * @see AddCommandSystemTest#assertCommandSuccess(Customer)
     */
    private void assertCommandSuccess(String command, Customer toAdd) {
        Model expectedModel = getModel();
        expectedModel.addCustomer(toAdd);
        String expectedResultMessage = String.format(AddCommand.MESSAGE_SUCCESS, toAdd);

        assertCommandSuccess(command, expectedModel, expectedResultMessage);
    }

    /**
     * Performs the same verification as {@code assertCommandSuccess(String, Customer)} except asserts that
     * the,<br>
     * 1. Result display box displays {@code expectedResultMessage}.<br>
     * 2. {@code Storage} and {@code CustomerListPanel} equal to the corresponding components in
     * {@code expectedModel}.<br>
     * @see AddCommandSystemTest#assertCommandSuccess(String, Customer)
     */
    private void assertCommandSuccess(String command, Model expectedModel, String expectedResultMessage) {
        executeCommand(command);
        assertApplicationDisplaysExpected("", expectedResultMessage, expectedModel);
        assertSelectedCardUnchanged();
        assertCommandBoxShowsDefaultStyle();
        assertStatusBarUnchangedExceptSyncStatus();
    }

    /**
     * Executes {@code command} and asserts that the,<br>
     * 1. Command box displays {@code command}.<br>
     * 2. Command box has the error style class.<br>
     * 3. Result display box displays {@code expectedResultMessage}.<br>
     * 4. {@code Storage} and {@code CustomerListPanel} remain unchanged.<br>
     * 5. Browser url, selected card and status bar remain unchanged.<br>
     * Verifications 1, 3 and 4 are performed by
     * {@code AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)}.<br>
     * @see AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)
     */
=======
    //    @Test
    //    public void add() {
    //        CustomerModel model = getModel();
    //
    //        /* ------------------------ Perform add operations on the shown unfiltered list
    //        ----------------------------- */
    //
    //        /* Case: add a customer without tags to a non-empty address book, command with leading spaces and trailing
    //         * spaces
    //         * -> added
    //         */
    //        Customer toAdd = AMY;
    //        String command = "   " + AddCommand.COMMAND_WORD + "  " + NAME_DESC_AMY + "  " + PHONE_DESC_AMY + " "
    //            + EMAIL_DESC_AMY + "   " + ADDRESS_DESC_AMY + "   " + TAG_DESC_FRIEND + " ";
    //        assertCommandSuccess(command, toAdd);
    //
    //        /* Case: undo adding Amy to the list -> Amy deleted */
    //        command = UndoCommand.COMMAND_WORD;
    //        String expectedResultMessage = UndoCommand.MESSAGE_SUCCESS;
    //        assertCommandSuccess(command, model, expectedResultMessage);
    //
    //        /* Case: redo adding Amy to the list -> Amy added again */
    //        command = RedoCommand.COMMAND_WORD;
    //        model.addCustomer(toAdd);
    //        expectedResultMessage = RedoCommand.MESSAGE_SUCCESS;
    //        assertCommandSuccess(command, model, expectedResultMessage);
    //
    //        /* Case: add a customer with all fields same as another customer in the address book except name ->
    //        added */
    //        toAdd = new CustomerBuilder(AMY).withName(VALID_NAME_BOB).build();
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_BOB + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
    //            + TAG_DESC_FRIEND;
    //        assertCommandSuccess(command, toAdd);
    //
    //        /* Case: add a customer with all fields same as another customer in the address book except phone and
    //        email
    //         * -> added
    //         */
    //        toAdd = new CustomerBuilder(AMY).withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).build();
    //        command = CustomerUtil.getAddCommand(toAdd);
    //        assertCommandSuccess(command, toAdd);
    //
    //        /* Case: add to empty address book -> added */
    //        deleteAllCustomers();
    //        assertCommandSuccess(ALICE);
    //
    //        /* Case: add a customer with tags, command with parameters in random order -> added */
    //        toAdd = BOB;
    //        command = AddCommand.COMMAND_WORD + TAG_DESC_FRIEND + PHONE_DESC_BOB + ADDRESS_DESC_BOB + NAME_DESC_BOB
    //            + TAG_DESC_HUSBAND + EMAIL_DESC_BOB;
    //        assertCommandSuccess(command, toAdd);
    //
    //        /* Case: add a customer, missing tags -> added */
    //        assertCommandSuccess(HOON);
    //
    //        /* -------------------------- Perform add operation on the shown filtered list
    //        ------------------------------ */
    //
    //        /* Case: filters the customer list before adding -> added */
    //        showCustomersWithName(KEYWORD_MATCHING_MEIER);
    //        assertCommandSuccess(IDA);
    //
    //        /* ------------------------ Perform add operation while a customer card is selected
    //        ------------------------- */
    //
    //        /* Case: selects first card in the customer list, add a customer -> added, card selection remains
    //        unchanged */
    //        selectCustomer(Index.fromOneBased(1));
    //        assertCommandSuccess(CARL);
    //
    //        /* ----------------------------------- Perform invalid add operations
    //        --------------------------------------- */
    //
    //        /* Case: add a duplicate customer -> rejected */
    //        command = CustomerUtil.getAddCommand(HOON);
    //        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
    //
    //        /* Case: add a duplicate customer except with different phone -> rejected */
    //        toAdd = new CustomerBuilder(HOON).withPhone(VALID_PHONE_BOB).build();
    //        command = CustomerUtil.getAddCommand(toAdd);
    //        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
    //
    //        /* Case: add a duplicate customer except with different email -> rejected */
    //        toAdd = new CustomerBuilder(HOON).withEmail(VALID_EMAIL_BOB).build();
    //        command = CustomerUtil.getAddCommand(toAdd);
    //        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
    //
    //        /* Case: add a duplicate customer except with different address -> rejected */
    //        toAdd = new CustomerBuilder(HOON).withAddress(VALID_ADDRESS_BOB).build();
    //        command = CustomerUtil.getAddCommand(toAdd);
    //        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
    //
    //        /* Case: add a duplicate customer except with different tags -> rejected */
    //        command = CustomerUtil.getAddCommand(HOON) + " " + PREFIX_TAG.getPrefix() + "friends";
    //        assertCommandFailure(command, AddCommand.MESSAGE_DUPLICATE_CUSTOMER);
    //
    //        /* Case: missing name -> rejected */
    //        command = AddCommand.COMMAND_WORD + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
    //
    //        /* Case: missing phone -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
    //
    //        /* Case: missing email -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
    //
    //        /* Case: missing address -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY;
    //        assertCommandFailure(command, String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
    //
    //        /* Case: invalid keyword -> rejected */
    //        command = "adds " + CustomerUtil.getCustomerDetails(toAdd);
    //        assertCommandFailure(command, Messages.MESSAGE_UNKNOWN_COMMAND);
    //
    //        /* Case: invalid name -> rejected */
    //        command = AddCommand.COMMAND_WORD + INVALID_NAME_DESC + PHONE_DESC_AMY + EMAIL_DESC_AMY +
    //        ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, Name.MESSAGE_CONSTRAINTS);
    //
    //        /* Case: invalid phone -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + INVALID_PHONE_DESC + EMAIL_DESC_AMY +
    //        ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, Phone.MESSAGE_CONSTRAINTS);
    //
    //        /* Case: invalid email -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + INVALID_EMAIL_DESC +
    //        ADDRESS_DESC_AMY;
    //        assertCommandFailure(command, Email.MESSAGE_CONSTRAINTS);
    //
    //        /* Case: invalid address -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY +
    //        INVALID_ADDRESS_DESC;
    //        assertCommandFailure(command, Address.MESSAGE_CONSTRAINTS);
    //
    //        /* Case: invalid tag -> rejected */
    //        command = AddCommand.COMMAND_WORD + NAME_DESC_AMY + PHONE_DESC_AMY + EMAIL_DESC_AMY + ADDRESS_DESC_AMY
    //            + INVALID_TAG_DESC;
    //        assertCommandFailure(command, Tag.MESSAGE_CONSTRAINTS);
    //    }
<<<<<<< HEAD
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
=======

    /** assertCommandFailure
     * @param command
     * @param expectedResultMessage
     */
>>>>>>> 19116c6b0ee10bb254ad70d84cc773ce75d25e48
    private void assertCommandFailure(String command, String expectedResultMessage) {
        CustomerModel expectedModel = getModel();

        executeCommand(command);
        assertApplicationDisplaysExpected(command, expectedResultMessage, expectedModel);
        assertSelectedCardUnchanged();
        assertCommandBoxShowsErrorStyle();
        assertStatusBarUnchanged();
    }
}
