package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
        WebDriver driver;
        By Admin =By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");

        public AdminPage(WebDriver driver) {
            this.driver = driver;
        }
        public void Admin()throws InterruptedException
        {
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(Admin).click();


        }

    }


