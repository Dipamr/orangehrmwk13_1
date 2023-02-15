package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='oxd-table-filter-header-title']")
    WebElement SystemUsersText;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]")
    WebElement UsernameField;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[2]/div/div[2]")
    WebElement UserRollDropDown;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']/div")
    WebElement EmployeeNameField;
    @FindBy(xpath = "\"//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]\")")
    WebElement StatusDropDown;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement SearchButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement ResetButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement AddButton;
    @FindBy(xpath = "//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]/i")
    WebElement DeleteButton;
    @FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']")
    WebElement popupdisplay;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement clickOnpopupButton;

//    public void clickOnSystemUsersText() {
//        clickOnElement(SystemUsersText);
//        log.info("click On clickOn SystemUsersText" + SystemUsersText.toString());

    public String verifySystemUserText() {
        return getTextFromElement(SystemUsersText);
    }

    public void clickOnUsernameField(String name) {
        clickOnElement(UsernameField);
        log.info("click On clickOn UsernameField" + UsernameField.toString());

    }

    public void clickOnUserRollDropDown(String name) {
        clickOnElement(UserRollDropDown);
        log.info("click On clickOn UserRollDropDown" + UserRollDropDown.toString());

    }

    public void clickOnEmployeeNameField() {
        clickOnElement(EmployeeNameField);
        log.info("click On clickOn EmployeeNameField" + EmployeeNameField.toString());
    }

    public void clickOnStatusDropDown() {
        clickOnElement(StatusDropDown);
        log.info("click On clickOn StatusDropDown" + StatusDropDown.toString());

    }

    public void clickOnSearchButton() {
        clickOnElement(SearchButton);
        log.info("click On clickOn StatusDropDown" + SearchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(ResetButton);
        log.info("click On clickOn ResetButton" + ResetButton.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(AddButton);
        log.info("click On clickOn AddButton" + AddButton.toString());
    }

    public void clickOnDeleteButton() {
        clickOnElement(DeleteButton);
        log.info("click On DeleteButton" + DeleteButton.toString());
    }

    public String verifypopupdisplay() {
        return getTextFromElement(popupdisplay);
    }

    public void clickOnpopupButton() {
        clickOnElement(clickOnpopupButton);
        log.info("click On popupButton" + clickOnpopupButton.toString());

    }
}
