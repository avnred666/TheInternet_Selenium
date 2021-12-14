package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testKeyPress(){
        var keypresses = homePage.clickKeyPressesLink();
        /*Press keyboard keys with selenium Keys class. Press multiple keys at the same time using Keys.chord method */
        keypresses.sendText(Keys.chord("a",Keys.BACK_SPACE));
        assertEquals(keypresses.returnEnteredText(),"You entered: BACK_SPACE","Incorrect keypress identified");
    }
}
