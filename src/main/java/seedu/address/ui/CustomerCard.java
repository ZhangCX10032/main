package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.customer.Customer;

/**
 * An UI component that displays information of a {@code Customer}.
 */
public class CustomerCard extends UiPart<Region> {

    private static final String FXML = "CustomerListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Customer customer;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label identificationNo;
    @FXML
    private Label email;
    @FXML
    private FlowPane tags;

    public CustomerCard(Customer customer, int displayedIndex) {
        super(FXML);
        this.customer = customer;
        id.setText(displayedIndex + ". ");
        name.setText(customer.getName().fullName);
        phone.setText(customer.getPhone().value);
<<<<<<< HEAD:src/main/java/seedu/address/ui/CustomerCard.java
=======
        identificationNo.setText(customer.getIdNum().value);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c:src/main/java/seedu/address/ui/CustomerCard.java
        address.setText(customer.getAddress().value);
        email.setText(customer.getEmail().value);
        customer.getTags().forEach(tag -> tags.getChildren().add(new Label(tag.tagName)));
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof CustomerCard)) {
            return false;
        }

        // state check
        CustomerCard card = (CustomerCard) other;
        return id.getText().equals(card.id.getText())
<<<<<<< HEAD:src/main/java/seedu/address/ui/CustomerCard.java
                && customer.equals(card.customer);
=======
            && customer.equals(card.customer);
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c:src/main/java/seedu/address/ui/CustomerCard.java
    }
}
