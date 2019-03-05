package systemtests;

<<<<<<< HEAD
import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;
import static seedu.address.testutil.TypicalCustomers.KEYWORD_MATCHING_MEIER;

import org.junit.Test;

import seedu.address.commons.core.index.Index;
=======
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.logic.commands.ClearCommand;
import seedu.address.model.CustomerManager;
import seedu.address.model.CustomerModel;

public class ClearCommandSystemTest extends AddressBookSystemTest {

<<<<<<< HEAD
    @Test
    public void clear() {
        final Model defaultModel = getModel();

        /* Case: clear non-empty address book, command with leading spaces and trailing alphanumeric characters and
         * spaces -> cleared
         */
        assertCommandSuccess("   " + ClearCommand.COMMAND_WORD + " ab12   ");
        assertSelectedCardUnchanged();

        /* Case: undo clearing address book -> original address book restored */
        String command = UndoCommand.COMMAND_WORD;
        String expectedResultMessage = UndoCommand.MESSAGE_SUCCESS;
        assertCommandSuccess(command, expectedResultMessage, defaultModel);
        assertSelectedCardUnchanged();

        /* Case: redo clearing address book -> cleared */
        command = RedoCommand.COMMAND_WORD;
        expectedResultMessage = RedoCommand.MESSAGE_SUCCESS;
        assertCommandSuccess(command, expectedResultMessage, new ModelManager());
        assertSelectedCardUnchanged();

        /* Case: selects first card in customer list and clears address book -> cleared and no card selected */
        executeCommand(UndoCommand.COMMAND_WORD); // restores the original address book
        selectCustomer(Index.fromOneBased(1));
        assertCommandSuccess(ClearCommand.COMMAND_WORD);
        assertSelectedCardDeselected();

        /* Case: filters the customer list before clearing -> entire address book cleared */
        executeCommand(UndoCommand.COMMAND_WORD); // restores the original address book
        showCustomersWithName(KEYWORD_MATCHING_MEIER);
        assertCommandSuccess(ClearCommand.COMMAND_WORD);
        assertSelectedCardUnchanged();

        /* Case: clear empty address book -> cleared */
        assertCommandSuccess(ClearCommand.COMMAND_WORD);
        assertSelectedCardUnchanged();

        /* Case: mixed case command word -> rejected */
        assertCommandFailure("ClEaR", MESSAGE_UNKNOWN_COMMAND);
    }
=======
    //    @Test
    //    public void clear() {
    //        final CustomerModel defaultModel = getModel();
    //
    //        /* Case: clear non-empty address book, command with leading spaces and trailing alphanumeric characters
    //        and
    //         * spaces -> cleared
    //         */
    //        assertCommandSuccess("   " + ClearCommand.COMMAND_WORD + " ab12   ");
    //        assertSelectedCardUnchanged();
    //
    //        /* Case: undo clearing address book -> original address book restored */
    //        String command = UndoCommand.COMMAND_WORD;
    //        String expectedResultMessage = UndoCommand.MESSAGE_SUCCESS;
    //        assertCommandSuccess(command, expectedResultMessage, defaultModel);
    //        assertSelectedCardUnchanged();
    //
    //        /* Case: redo clearing address book -> cleared */
    //        command = RedoCommand.COMMAND_WORD;
    //        expectedResultMessage = RedoCommand.MESSAGE_SUCCESS;
    //        assertCommandSuccess(command, expectedResultMessage, new CustomerManager());
    //        assertSelectedCardUnchanged();
    //
    //        /* Case: selects first card in customer list and clears address book -> cleared and no card selected */
    //        executeCommand(UndoCommand.COMMAND_WORD); // restores the original address book
    //        selectCustomer(Index.fromOneBased(1));
    //        assertCommandSuccess(ClearCommand.COMMAND_WORD);
    //        assertSelectedCardDeselected();
    //
    //        /* Case: filters the customer list before clearing -> entire address book cleared */
    //        executeCommand(UndoCommand.COMMAND_WORD); // restores the original address book
    //        showCustomersWithName(KEYWORD_MATCHING_MEIER);
    //        assertCommandSuccess(ClearCommand.COMMAND_WORD);
    //        assertSelectedCardUnchanged();
    //
    //        /* Case: clear empty address book -> cleared */
    //        assertCommandSuccess(ClearCommand.COMMAND_WORD);
    //        assertSelectedCardUnchanged();
    //
    //        /* Case: mixed case command word -> rejected */
    //        assertCommandFailure("ClEaR", MESSAGE_UNKNOWN_COMMAND);
    //    }
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c

    /**
     * Executes {@code command} and verifies that the command box displays an empty string, the result display
     * box displays {@code ClearCommand#MESSAGE_SUCCESS} and the model related components equal to an empty model.
     * These verifications are done by
     * {@code AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)}.<br>
     * Also verifies that the command box has the default style class and the status bar's sync status changes.
     *
     * @see AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, CustomerModel)
     */
    private void assertCommandSuccess(String command) {
        assertCommandSuccess(command, ClearCommand.MESSAGE_SUCCESS, new CustomerManager());
    }

    /**
     * Performs the same verification as {@code assertCommandSuccess(String)} except that the result box displays
     * {@code expectedResultMessage} and the model related components equal to {@code expectedModel}.
     *
     * @see ClearCommandSystemTest#assertCommandSuccess(String)
     */
    private void assertCommandSuccess(String command, String expectedResultMessage, CustomerModel expectedModel) {
        executeCommand(command);
        assertApplicationDisplaysExpected("", expectedResultMessage, expectedModel);
        assertCommandBoxShowsDefaultStyle();
        assertStatusBarUnchangedExceptSyncStatus();
    }

    /**
     * Executes {@code command} and verifies that the command box displays {@code command}, the result display
     * box displays {@code expectedResultMessage} and the model related components equal to the current model.
     * These verifications are done by
     * {@code AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, Model)}.<br>
     * Also verifies that the browser url, selected card and status bar remain unchanged, and the command box has the
     * error style.
     *
     * @see AddressBookSystemTest#assertApplicationDisplaysExpected(String, String, CustomerModel)
     */
    private void assertCommandFailure(String command, String expectedResultMessage) {
        CustomerModel expectedModel = getModel();

        executeCommand(command);
        assertApplicationDisplaysExpected(command, expectedResultMessage, expectedModel);
        assertSelectedCardUnchanged();
        assertCommandBoxShowsErrorStyle();
        assertStatusBarUnchanged();
    }
}
