package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addPage {
    WebDriver driver;
    By add =By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']");

    public addPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Add()throws InterruptedException
    {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(add).click();


    }

}



