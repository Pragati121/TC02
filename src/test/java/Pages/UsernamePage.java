package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsernamePage {
    WebDriver driver;
    By Username =By.xpath("//input[@placeholder='Type for hints...']");

    public UsernamePage(WebDriver driver)
    {

        this.driver = driver;
    }
    public void User()
    {
        driver.manage().window().maximize();
        driver.findElement(Username).sendKeys("Pragati");


    }

}


