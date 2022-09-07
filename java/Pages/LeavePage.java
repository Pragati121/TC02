package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeavePage {
    WebDriver driver;

    By holiday =By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
    By Apply = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']");
    By Select= By.xpath("//div[@class='oxd-select-text-input']");
    By Name=By.xpath("//div[@class='oxd-select-text-input']");
    By Date= By.xpath("//input[@placeholder='yyyy-mm-dd']");
    By ToDate = By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");


    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }
    @Test(priority = 1)
    public void leave()
    {
        driver.manage().window().maximize();
        driver.findElement(holiday).click();
        driver.findElement(Apply).click();
        driver.findElement(Select).click();
        driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]")).click();
        driver.findElement(Date).click();
        driver.findElement(Name).click();
        driver.findElement(ToDate).click();
    }

}
