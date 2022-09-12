package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
private Dashboard dashboard;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage GetLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public Dashboard Getdashboard() {
        if (dashboard == null) {
            dashboard = new Dashboard(driver);
        }
        return dashboard;
    }

}


