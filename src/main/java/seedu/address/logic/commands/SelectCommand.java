package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.exceptions.CommandException;
<<<<<<< HEAD
import seedu.address.model.Model;
=======
import seedu.address.model.CustomerModel;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;

/**
 * Selects a customer identified using it's displayed index from the address book.
 */
public class SelectCommand extends CustomerCommand {

    public static final String COMMAND_ALIAS = "s";
    public static final String COMMAND_WORD = "select";

    public static final String MESSAGE_USAGE = COMMAND_WORD
<<<<<<< HEAD
            + ": Selects the customer identified by the index number used in the displayed customer list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";
=======
        + ": Selects the customer identified by the index number used in the displayed customer list.\n"
        + "Parameters: INDEX (must be a positive integer)\n"
        + "Example: " + COMMAND_WORD + " 1";
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c

    public static final String MESSAGE_SELECT_CUSTOMER_SUCCESS = "Selected Customer: %1$s";

    private final Index targetIndex;

    public SelectCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(CustomerModel model, CommandHistory history) throws CommandException {
        requireNonNull(model);

        List<Customer> filteredCustomerList = model.getFilteredCustomerList();

        if (targetIndex.getZeroBased() >= filteredCustomerList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_CUSTOMER_DISPLAYED_INDEX);
        }

        model.setSelectedCustomer(filteredCustomerList.get(targetIndex.getZeroBased()));
        return new CommandResult(String.format(MESSAGE_SELECT_CUSTOMER_SUCCESS, targetIndex.getOneBased()));

    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof SelectCommand // instanceof handles nulls
            && targetIndex.equals(((SelectCommand) other).targetIndex)); // state check
    }
}
