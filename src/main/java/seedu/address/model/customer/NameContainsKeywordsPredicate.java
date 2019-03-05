package seedu.address.model.customer;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
 * Tests that a {@code Customer}'s {@code Name} matches any of the keywords given.
 */
public class NameContainsKeywordsPredicate implements Predicate<Customer> {
    private final List<String> keywords;

    public NameContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Customer customer) {
        return keywords.stream()
<<<<<<< HEAD:src/main/java/seedu/address/model/customer/NameContainsKeywordsPredicate.java
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(customer.getName().fullName, keyword));
=======
            .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(customer.getName().fullName, keyword));
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c:src/main/java/seedu/address/model/customer/NameContainsKeywordsPredicate.java
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof NameContainsKeywordsPredicate // instanceof handles nulls
            && keywords.equals(((NameContainsKeywordsPredicate) other).keywords)); // state check
    }

}
