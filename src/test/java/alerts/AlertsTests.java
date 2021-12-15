package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testJSAlert(){
        var javascriptAlertsPage = homePage.clickJSAlertsLink();
        javascriptAlertsPage.buttonJSAlertClick();
        javascriptAlertsPage.clickOKOnJSAlert();
        assertEquals(javascriptAlertsPage.resultOnPage(),"You successfully clicked an alert","Incorrect message displayed");
    }

    @Test(dependsOnMethods = {"testJSAlert"})
    public void testJSConfirm(){
        var javascriptAlertsPage = homePage.clickJSAlertsLink();
        javascriptAlertsPage.buttonJSConfirmClick();
        javascriptAlertsPage.clickCancelOnJSConfirm();
        assertEquals(javascriptAlertsPage.resultOnPage(),"You clicked: Cancel","Incorrect message displayed");
    }

    @Test(dependsOnMethods = {"testJSAlert","testJSConfirm"})
    public void testJSPrompt(){
        String text = "Hello!";
        var javascriptAlertsPage = homePage.clickJSAlertsLink();
        javascriptAlertsPage.buttonJSPromptClick();
        javascriptAlertsPage.enterTextForJSPrompt(text);
        javascriptAlertsPage.clickOKOnJSAlert();
        assertEquals(javascriptAlertsPage.resultOnPage(),"You entered: "+text,"Incorrect message displayed");
    }
}
