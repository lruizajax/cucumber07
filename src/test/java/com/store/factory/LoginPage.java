package com.store.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//Object repository
    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginLink;

    @FindBy(name = "Email")
    private WebElement emailField;

    @FindBy(name = "Password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;

    // constructor with PageFactory for initiate all the page objects
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillOutForm(String user, String pas) {

    }

    // actions or functions that require the automation process
    public void setEmail(String email) {
    	emailField.sendKeys(email);
    }

    public void setPassword(String password) {
    	passwordField.sendKeys(password);
    }

    public void navigateToLoginPage() {
    	loginLink.click();
    }

    public void doLogin() {
    	loginButton.submit();
    }

    public void doLoginUser(String email, String password) {
    	//implement me
    }

    public void isDashboardPageDisplayed() {
    	//implement me
    }

}
