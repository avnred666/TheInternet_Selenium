package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testDLExample1Page(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var dlExample1Page = dynamicLoadingPage.clickExample1();
        dlExample1Page.clickStartBtn();
        assertEquals(dlExample1Page.getMessageText(),"Hello World!","Message Text Incorrect");
    }

    @Test
    public void testDLExample2Page(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var dlExample2Page = dynamicLoadingPage.clickExample2();
        dlExample2Page.clickStartBtn();
        assertEquals(dlExample2Page.getMessageText(),"Hello World!","Message Text Incorrect");
    }
}
