package com.webautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;
    // contains element and function
    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Element
    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(css = "input.login-btn")
    WebElement loginButton;

    public void loginApplication(String email, String passUser){
        userEmail.sendKeys(email);
        password.sendKeys(passUser);

        loginButton.click();
    }

}
