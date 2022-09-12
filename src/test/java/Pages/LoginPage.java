
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
                WebDriver driver;
                By Mail =By.xpath("//input[@class='email']");
                By password  = By.xpath("//input[@class='password']");
                By submit = By.xpath("//button[@type='submit']");
                public LoginPage(WebDriver driver)
                {
                        this.driver = driver;
                }
                public void login()throws InterruptedException
                {
                        driver.manage().window().maximize();
                        Thread.sleep(3000);
                        driver.findElement(submit).click();
                }
        }