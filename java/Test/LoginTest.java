package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

@Test(priority = 1)
 public void loginnew() throws InterruptedException
{
        getPageFactory.GetLoginPage().login();

 }
 @Test(priority = 2)
         public void Adminnew()throws InterruptedException{
   getPageFactory.getAdminpage().Admin();}
    @Test(priority = 3)
    public void Addnew()throws InterruptedException {
        getPageFactory.getAddpage().Add();
    }
    @Test(priority = 4)
    public void Usernew()throws InterruptedException {
        getPageFactory.getUsernamePage().User();
    }
    @Test(priority = 5)
    public void Leavenew()throws InterruptedException {
    System.out.println("hi");
        getPageFactory.getLeave().leave();
    }

    }

