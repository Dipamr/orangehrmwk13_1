package com.orangehrm.testsuite;

import com.orangehrm.pages.*;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUserPage viewSystemUserPage;
    AdminPage adminPage;
    AddUserPage addUserPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUserPage=new ViewSystemUserPage();
        adminPage  = new AdminPage();
        addUserPage = new AddUserPage();
    }
    @Test
    public void adminShouldaddUserSuccessfully(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdmin();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
        viewSystemUserPage.clickOnAddButton();

        String actualMsg = addUserPage.verifyaddUserText();
        String expectedMsg = "Add Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
        addUserPage.clickOnUserRollDropDown("Admin");
        addUserPage.clickOnEmployeeName("Ananya Dash");
        addUserPage.clickOnUsername();
        addUserPage.clickOnPassword();
        addUserPage.clickOnPassword();
        addUserPage.clickOnSaveButton();

    }
    @Test
    public void searchtheUserCreatedAndVerifyIt(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdmin();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
       Assert.assertEquals(actualText, expectedText, "Test is verified");
        viewSystemUserPage.clickOnUsernameField("sakshi wadhwani");
        viewSystemUserPage.clickOnUserRollDropDown("Admin");
        viewSystemUserPage.clickOnStatusDropDown();

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdmin();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
        viewSystemUserPage.clickOnStatusDropDown();
        viewSystemUserPage.clickOnSearchButton();
        viewSystemUserPage.clickOnDeleteButton();
        viewSystemUserPage.verifypopupdisplay();
        viewSystemUserPage.clickOnpopupButton();
    }
    @Test
    public void SearchTheDeleteUserAndVerifyTheMessageNoRecordFound(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        addUserPage.clickOnAdmin();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
    }
}

