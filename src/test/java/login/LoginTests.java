package login;

import base.BaseTests;
import dataprovider.LoginData;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {

    @Test (dataProviderClass = LoginData.class,dataProvider="signin-provider")
    public void testSuccessfulLogin(String username, String password){
        LoginPage loginPage = homePage.clickFormLink();
        loginPage.setUsernameField(username);
        loginPage.setPasswordField(password);
        SecureAreaPage secureAreaPage = loginPage.clickSubmitButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }

}
