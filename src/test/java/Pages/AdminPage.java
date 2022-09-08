package Pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AdminPage {
        WebDriver driver;
        By Admin =By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");

        public AdminPage(WebDriver driver) {
            this.driver = driver;
        }
        public void Admin()throws InterruptedException
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(Admin).click();


        }

    }


