package Test;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            getPageFactory = new PageFactory(driver);
        }

    }
    @AfterClass
    public void quit()
    {
        driver.quit();
    }
}


