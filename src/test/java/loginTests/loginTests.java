package loginTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

public class loginTests extends BaseTests {

    @Test
    public void testSuccessfullyLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.setUsername("tomsmith");
        SecureArea secureArea = loginPage.clickLoginButton();
        secureArea.getLogOutButton();
        Assert.assertTrue(secureArea.logoutButtonElement.isDisplayed());

    }
}
