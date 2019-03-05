package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.core.Messages;
import seedu.address.logic.CommandHistory;
<<<<<<< HEAD
import seedu.address.model.Model;
=======
import seedu.address.model.CustomerModel;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.NameContainsKeywordsPredicate;

/**
 * Finds and lists all customers in address book whose name contains any of the argument keywords.
 * Keyword matching is case insensitive.
 */
public class FindCommand extends CustomerCommand {

    public static final String COMMAND_ALIAS = "fn";
    public static final String COMMAND_WORD = "findname";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all customers whose names contain any of "
<<<<<<< HEAD
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " alice bob charlie";
=======
        + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
        + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
        + "Example: " + COMMAND_WORD + " alice bob charlie";
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c

    private final NameContainsKeywordsPredicate predicate;

    public FindCommand(NameContainsKeywordsPredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(CustomerModel model, CommandHistory history) {
        requireNonNull(model);
        model.updateFilteredCustomerList(predicate);
        return new CommandResult(
<<<<<<< HEAD
                String.format(Messages.MESSAGE_CUSTOMERS_LISTED_OVERVIEW, model.getFilteredCustomerList().size()));
=======
            String.format(Messages.MESSAGE_CUSTOMERS_LISTED_OVERVIEW, model.getFilteredCustomerList().size()));
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof FindCommand // instanceof handles nulls
            && predicate.equals(((FindCommand) other).predicate)); // state check
    }
}
