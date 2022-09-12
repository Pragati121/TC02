package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
public class BaseClass {
    static WebDriver driver;
    static Pages.PageFactory getPageFactory;

    @BeforeClass
    public static void setup() {
        {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            getPageFactory = new PageFactory(driver);
        }

    }
    @AfterClass
    public void quit()
    {
        driver.quit();
    }
}


