package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC7Page {
    WebDriver driver;


    By Assignl =By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link --more'])[4]");

    public TC7Page(WebDriver driver) {
        this.driver=driver;
    }
    @Test()
    public void Display()
    {
        driver.findElement(Assignl).click();

    }

}

