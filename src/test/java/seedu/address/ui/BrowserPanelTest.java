package seedu.address.ui;

import static guitests.guihandles.WebViewUtil.waitUntilBrowserLoaded;
import static org.junit.Assert.assertEquals;
import static seedu.address.testutil.TypicalCustomers.ALICE;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import guitests.guihandles.BrowserPanelHandle;
import javafx.beans.property.SimpleObjectProperty;
import seedu.address.model.customer.Customer;

public class BrowserPanelTest extends GuiUnitTest {
    private SimpleObjectProperty<Customer> selectedCustomer = new SimpleObjectProperty<>();
    private BrowserPanel browserPanel;
    private BrowserPanelHandle browserPanelHandle;

    @Before
    public void setUp() {
        guiRobot.interact(() -> browserPanel = new BrowserPanel(selectedCustomer));
        uiPartRule.setUiPart(browserPanel);

        browserPanelHandle = new BrowserPanelHandle(browserPanel.getRoot());
    }

    @Test
    public void display() throws Exception {
        // default web page
        assertEquals(BrowserPanel.DEFAULT_PAGE, browserPanelHandle.getLoadedUrl());

        // associated web page of a customer
        guiRobot.interact(() -> selectedCustomer.set(ALICE));
        URL expectedCustomerUrl = new URL(BrowserPanel.SEARCH_PAGE_URL
<<<<<<< HEAD
                + ALICE.getName().fullName.replaceAll(" ", "%20"));
=======
            + ALICE.getName().fullName.replaceAll(" ", "%20"));
>>>>>>> cbebf3c46e02dcd016ad08f56b59fa61c34d5b6c

        waitUntilBrowserLoaded(browserPanelHandle);
        assertEquals(expectedCustomerUrl, browserPanelHandle.getLoadedUrl());
    }
}
