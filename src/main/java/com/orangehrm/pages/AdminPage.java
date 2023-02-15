package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent --visited']")
    WebElement UserManagement;
    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[3]")
    WebElement Job;
    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[3]")
    WebElement OrganizationTabs;

    public void clickOnUserMangement() {
        clickOnElement(UserManagement);
        log.info("click On UserMangement" + UserManagement.toString());
    }
    public void clickOnJob() {
        clickOnElement(Job);
        log.info("click On Job" + Job.toString());
    }
    public void clickOnOrganizationTabs() {
        clickOnElement(OrganizationTabs);
        log.info("click On OrganizationTabs" + OrganizationTabs.toString());
    }
}
