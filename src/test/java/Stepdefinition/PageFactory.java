package Stepdefinition;

import Pages.AddItemToCartPage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddItemToCartPage AddItemMethod;
    PageFactory(WebDriver driver) {
        this.driver=driver;

    }
    public AddItemToCartPage getCartPage() {
        if (AddItemMethod == null) {
            AddItemMethod = new AddItemToCartPage(driver);
        }
        return AddItemMethod;
    }

}
