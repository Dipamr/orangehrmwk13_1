package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.naming.Name;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement Username;
    @FindBy(name = "password")
    WebElement Password;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement LoginButton;
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement WelcomeText;
    @FindBy(xpath = "//div[@class='orangehrm-login-form']")
    WebElement LoginPaneltext;
    @FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']")
    WebElement hoverOnlogout;
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[3]/a")
    WebElement clickOnLogoutLink;

    public void username(String username) {
        sendTextToElement(Username, username);
    }

    public void password(String password) {
        sendTextToElement(Password, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);

    }

    public String verifyLoginPaneltext() {
        return getTextFromElement(LoginPaneltext);

    }
    public void hoverOnlogout(){
        clickOnElement(hoverOnlogout);
    }
    public void clickOnLogoutLink() {
        clickOnElement(clickOnLogoutLink);

    }


    public String verifyWelcomeText() {
        return getTextFromElement(WelcomeText);
    }


    }

