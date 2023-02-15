package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement UserRollDropDown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement EmployeeName;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[1]/div/div[4]")
    WebElement Username;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[2]/div/div[1]")
    WebElement Password;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[2]/div/div[2]")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[3]/button[2]")
    WebElement SaveButton;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[3]/button[1]")
    WebElement CancleButton;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']")
    WebElement AddButton;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/h6")
    WebElement addauserText;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[1]/a[1]/span")
    WebElement AdminButton;

    public void clickOnUserRollDropDown(String i) {
        clickOnElement(UserRollDropDown);
        log.info("click On clickOnPIM" + UserRollDropDown.toString());
    }

    public void clickOnEmployeeName(String ananyaDash) {
        clickOnElement(EmployeeName);
        log.info("click On EmployeeName" + EmployeeName.toString());
    }

    public void clickOnUsername() {
        clickOnElement(Username);
        log.info("click On Username" + Username.toString());
    }

    public void clickOnPassword() {
        clickOnElement(Password);
        log.info("click On Password" + Password.toString());
    }

    public void clickOnConfirmPassword() {
        clickOnElement(ConfirmPassword);
        log.info("click On ConfirmPassword" + ConfirmPassword.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(SaveButton);
        log.info("click On SaveButton" + SaveButton.toString());
    }

    public void clickOnCancleButton() {
        clickOnElement(CancleButton);
        log.info("click On CancleButton" + CancleButton.toString());
    }

    public void AddButton() {
        clickOnElement(CancleButton);
        log.info("click On AddButton" + AddButton.toString());
    }

    public String verifyaddUserText() {
        return getTextFromElement(addauserText);
    }

    public void clickOnAdmin() {
        clickOnElement(AdminButton);
        log.info("click On AddminButton" + AdminButton.toString());
    }
}
