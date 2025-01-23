package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.webautomation.pageobjects.Login;

public class DeleteProduct {
    public static void main(String[] args) throws InterruptedException {
        //Setup driver
        System.setProperty("webdriver.chrome.driver", "/Users/bytedance/CourseQAAutomation/Web Automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/client");

        //Scenario login
        Login login = new Login(driver);
        login.loginApplication("simanjuntakalbert57@gmail.com", "XBf@rWNvByn!#K8");

        

        driver.quit();
    }
}
