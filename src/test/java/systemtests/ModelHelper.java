package systemtests;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

<<<<<<< HEAD
import seedu.address.model.Model;
=======
import seedu.address.model.CustomerModel;
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
import seedu.address.model.customer.Customer;

/**
 * Contains helper methods to set up {@code Model} for testing.
 */
public class ModelHelper {
    private static final Predicate<Customer> PREDICATE_MATCHING_NO_CUSTOMERS = unused -> false;

    /**
     * Updates {@code model}'s filtered list to display only {@code toDisplay}.
     */
<<<<<<< HEAD
    public static void setFilteredList(Model model, List<Customer> toDisplay) {
        Optional<Predicate<Customer>> predicate =
                toDisplay.stream().map(ModelHelper::getPredicateMatching).reduce(Predicate::or);
=======
    public static void setFilteredList(CustomerModel model, List<Customer> toDisplay) {
        Optional<Predicate<Customer>> predicate =
            toDisplay.stream().map(ModelHelper::getPredicateMatching).reduce(Predicate::or);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        model.updateFilteredCustomerList(predicate.orElse(PREDICATE_MATCHING_NO_CUSTOMERS));
    }

    /**
     * @see ModelHelper#setFilteredList(CustomerModel, List)
     */
<<<<<<< HEAD
    public static void setFilteredList(Model model, Customer... toDisplay) {
=======
    public static void setFilteredList(CustomerModel model, Customer... toDisplay) {
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c
        setFilteredList(model, Arrays.asList(toDisplay));
    }

    /**
     * Returns a predicate that evaluates to true if this {@code Customer} equals to {@code other}.
     */
    private static Predicate<Customer> getPredicateMatching(Customer other) {
        return customer -> customer.equals(other);
    }
}
