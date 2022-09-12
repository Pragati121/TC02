package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
    WebDriver driver;
   By dashboard =By.xpath("//a[@class='nav-link active']");
    By order =By.xpath("(//div[@class='card card-primary card-outline collapsed-card']");
    public Dashboard(WebDriver driver)
    {
        this.driver = driver;
    }
    public void dashboard()throws InterruptedException
    {
        driver.manage().window().maximize();
        Thread.sleep(3000);
       driver.findElement(dashboard).click();
        driver.findElement(order).click();
    }
}
