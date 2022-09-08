package Test;

import org.testng.annotations.Test;

public class TC7Test extends BaseClass{

        @Test(priority = 1)
        public void loginnew() throws InterruptedException
        {
            getPageFactory.GetLoginPage().login();

        }
        @Test(priority = 2)
        public void Adminnew()throws InterruptedException
        {
            getPageFactory.getAdminpage().Admin();
        }

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
            getPageFactory.getLeave().leave();
        }
    @Test(priority = 6)
    public void Tc()throws InterruptedException {
        getPageFactory.getTc().Display();
    }

    }




