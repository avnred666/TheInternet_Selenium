package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverLinkForUser1(){
        HoversPage hoversPage = homePage.clickHoversLink();
        HoversPage.Captions captions = hoversPage.hoverOverBoxIndex(1);
        assertTrue(captions.getUsername().contains("user1"),"User name is incorrect");
        assertTrue(captions.getUserLinkURL().contains("/users/1"),"URL is incorrect");
        assertEquals(captions.getUserLinkText(),"View profile", "Link Text for user is incorrect in Hovers page");
    }

}
