package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();//using gecko driver
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitly time
        String title= driver.getTitle();//get page title
        System.out.println(title);
        String currentUrl= driver.getCurrentUrl();//get current url
        System.out.println("current URL="+currentUrl);
        WebElement emailField= driver.findElement(By.id("Email"));//find email element
        emailField.sendKeys("prime123@gmial.com");
        WebElement password= driver.findElement(By.name("Password"));//find password element
        password.sendKeys("Prime123");
        //closing url
        driver.close();
    }
}
