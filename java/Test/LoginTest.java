package Test;

import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BaseClass {


    public static void main(String[] args) throws InterruptedException
    {
  setup();
  getPageFactory.GetLoginPage().login();
        
    }
}
