package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private AdminPage adminpage;
    private addPage addPage;
    private UsernamePage UserNamePage;
    private LeavePage LeavePage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage GetLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public AdminPage getAdminpage() {
        if (adminpage == null) {
            adminpage = new AdminPage(driver);
        }
        return adminpage;
    }

    public addPage getAddpage() {
        if (addPage == null) {
            addPage = new addPage(driver);
        }
        return addPage;
    }

    public UsernamePage getUsernamePage() {
        if (UserNamePage == null) {
            UserNamePage = new UsernamePage(driver);
        }
        return UserNamePage;
    }

    public LeavePage getLeave() {
        if (LeavePage == null) {
            LeavePage = new LeavePage(driver);
        }
        return LeavePage;
    }
}


