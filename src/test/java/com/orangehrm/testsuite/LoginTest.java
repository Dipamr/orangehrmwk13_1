package com.orangehrm.testsuite;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();


    }
    @Test
    public void verifyUserShoudLoginSuccessFully(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        loginPage.verifyWelcomeText();

    }
    @Test
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnOrangeHRMlogo();

    }
    @Test
    public void verifyUserShouldLogOutSuccessfully(){
        loginPage.username("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLoginButton();
        loginPage.hoverOnlogout();
        loginPage.clickOnLogoutLink();
    }

}


