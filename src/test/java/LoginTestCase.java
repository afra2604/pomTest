import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePages;
import pages.LoginPages;

public class LoginTestCase {
    @Test
    public void test() {
        // initiate webdriver
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // maximize windows browser
        driver.manage().window().maximize();


        LoginPages login = new LoginPages(driver);
        HomePages home = new HomePages(driver);

        login.enterUsername("student");
        login.enterPassword("Password123");

        login.clickButton();

        home.getTextProducts();

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(home.getActualUrl(), expectedURL);

        driver.quit();
    }
}