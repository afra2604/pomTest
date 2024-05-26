package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePages {

    WebDriver driver;

    public HomePages(WebDriver driver){
        this.driver = driver;
    }

    By textProduct = By.xpath("//*[contains(text(),'Congratulations')]");

    public void getTextProducts(){
        driver.findElement(textProduct).isDisplayed();
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }
}
