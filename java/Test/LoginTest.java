package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginnew() throws InterruptedException {
        getPageFactory.GetLoginPage().login();

    }
}
