package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPasswordButtonText(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();
        assertEquals(forgotPasswordPage.retrievePasswordButtonText(),"Retrieve password","Incorrect text for button");
    }
}
