package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    static WebDriver driver;
     static Pages.PageFactory getPageFactory;

    static void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        getPageFactory = new PageFactory(driver);
    }
}

