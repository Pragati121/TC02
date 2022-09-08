package Test;

import org.testng.annotations.Test;

import static Test.BaseClass.getPageFactory;

public class UsernameTest extends BaseClass{
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

}
