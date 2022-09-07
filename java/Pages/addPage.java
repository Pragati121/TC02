package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addPage {
    WebDriver driver;
    By add =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public addPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Add()
    {
        driver.manage().window().maximize();
        driver.findElement(add).click();


    }

}



