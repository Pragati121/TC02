package Test;

import org.testng.annotations.Test;

public class DashboardTest extends BaseClass{
    @Test(priority = 1)
    public void loginnew() throws InterruptedException {
        getPageFactory.GetLoginPage().login();
    }

        @Test(priority = 2)
        public void dashboard() throws InterruptedException {
            getPageFactory.Getdashboard().dashboard();
        }
    }

