package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LeavePage {
    WebDriver driver;

    By holiday =By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]");
    By Apply = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']");
    By Select= By.xpath("//div[@class='oxd-select-text-input']");
    By Date= By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
   // By Comments = By.xpath("//textarea[@class=oxd-textarea oxd-textarea--active oxd-textarea--");
    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }
    @Test(priority = 1)
    public void leave()throws InterruptedException
    {
        driver.manage().window().maximize();
        driver.findElement(holiday).click();
        driver.findElement(Apply).click();
        driver.findElement(Select).click();
        driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]")).click();
        driver.findElement(Date).click();
        driver.findElement(By.xpath("//*[contains(text(),'Today')]")).click();
   Thread.sleep(3000);
    }
}
