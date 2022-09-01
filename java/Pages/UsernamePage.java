package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsernamePage {
    WebDriver driver;
    By Username =By.xpath("//input[@class='oxd-input oxd-input--active toggled']");

    public UsernamePage(WebDriver driver) {
        this.driver = driver;
    }
    public void User()throws InterruptedException
    {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(Username).click();


    }

}


