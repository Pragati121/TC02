package Stepdefinition;
import Stepdefinition.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass
{
    WebDriver driver;
    public PageFactory pageFactory;

    public void Setup() throws IOException {
        FileReader reader = new FileReader("src/test/java/Properties/Resource.Properties");
        Properties data = new Properties();
        data.load(reader);
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.get(data.getProperty("URL"));
        pageFactory = new PageFactory(driver);
        driver.manage().window().maximize();
    }
    public void close() {
        driver.quit();
    }
}