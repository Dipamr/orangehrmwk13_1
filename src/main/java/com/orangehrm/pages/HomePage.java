package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='oxd-brand-banner']/img")
    WebElement StoreOrangeHRMlogo;
    @FindBy(xpath = "//nav[@class='oxd-navbar-nav']/div[2]/ul/li[1]")
    WebElement clickOnAdmin;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[2]")
    WebElement clickOnPIM;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[3]")
    WebElement clickOnLeave;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[8]")
    WebElement clickOnDashboard;
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement WelcomeText;
    @FindBy(xpath = "//div[@class='oxd-brand-banner']/img")
    WebElement OrangeHRMlogo;

    public void clickOnStoreOrangeHRMlogo() {
        clickOnElement(StoreOrangeHRMlogo);
        log.info("click On LogoutLink" + StoreOrangeHRMlogo.toString());

    }

    public void clickOnAdmin() {
        clickOnElement(clickOnAdmin);
        log.info("click On clickOnAdmin" + clickOnAdmin.toString());
    }

    public void clickOnPIM() {
        clickOnElement(clickOnPIM);
        log.info("click On clickOnPIM" + clickOnPIM.toString());
    }

    public void clickOnLeave() {
        clickOnElement(clickOnLeave);
        log.info("click On clickOnLeave" + clickOnLeave.toString());

    }

    public void clickOnDashboard() {
        clickOnElement(clickOnDashboard);
        log.info("click On clickOn Dashboard" + clickOnDashboard.toString());

    }

    public String verifyWelcomeText() {
        return getTextFromElement(WelcomeText);
    }

    public void clickOnOrangeHRMlogo() {
        clickOnElement(OrangeHRMlogo);
        log.info("click On clickOn OrangeHRMlogo" + OrangeHRMlogo.toString());
    }
}