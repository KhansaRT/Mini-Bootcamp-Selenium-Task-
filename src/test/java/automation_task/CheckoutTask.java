package automation_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTask {
    public static void main(String[] args) throws InterruptedException {
        //Setup driver
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");  

        //Login scenario
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#login-button")).click();
        
        //Add to chart scenario (3 produk)
        Thread.sleep(500);
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(500);
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(500);
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);

        //Check out scenario
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("checkout_button")).click();
        /* Mengisi data checkout */
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Khansa");
        driver.findElement(By.id("last-name")).sendKeys("Rafifah Taqiyyah");
        driver.findElement(By.id("postal-code")).sendKeys("15610");
        Thread.sleep(2000);
        driver.findElement(By.className("submit-button")).click();
        /* Melakukan scroll down sampai button finish terlihat*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, 90)");
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        /* Klik button finish check out */
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        /*Kembali ke halaman utama */
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}


