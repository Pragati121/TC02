package Pages;

import EnumPack.addTocratEnum;
import Stepdefinition.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;public class AddItemToCartPage extends BaseClass {
    WebDriver driver;
    WebDriverWait wait;
    String searchBar = "//input[@id='%s']";
    By  clickOnOpoMobile = By.linkText("Oppo F19 6GB 128GB Prism Black (Oppo F19 6GB 128GB)");


    public AddItemToCartPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void clickOnSearchBar() {
        driver.findElement(By.xpath(String.format(searchBar, addTocratEnum.SearchInput.getResourcesName()))).sendKeys("Oppo F19 6GB 128GB Prism Black");
        driver.findElement(By.xpath(String.format(searchBar, addTocratEnum.SearchButton.getResourcesName()))).click();
    }
    public void clickOnMobile(){
//        String mainWindow = driver.getWindowHandle();
//        ArrayList<String> childTabWindow = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(String.valueOf(childTabWindow.get(1)));
        driver.findElement(clickOnOpoMobile).click();
    }
    public void C
}
