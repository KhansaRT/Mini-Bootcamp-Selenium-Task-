package com.webautomation.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
    WebDriver driver;
    WebElement cardElement = null;
    
    // contains element and function
    public ProductListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mb-3")
    List<WebElement> listProducts;

    @FindBy(css = "b")
    WebElement productNameElm;

    By cartButton = By.cssSelector(".card-body button:last-of-type");

    public void addProduct(String productName){
        for (WebElement webElement : listProducts) {
            String product = webElement.findElement(By.cssSelector("b")).getText();
            // System.out.println("ini adladh product" + product);
            if (product.equals(productName)) {
                cardElement = webElement;
                // System.out.println("stop");
                break;
            }
        }

        cardElement.findElement(cartButton).click();
    }
}
