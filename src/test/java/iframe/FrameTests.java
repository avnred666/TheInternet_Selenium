package iframe;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwygEditor(){
        var wysiwygEditorPage = homePage.clickWysiwygEditorLink();
        wysiwygEditorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "World!";

        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.clickIncreaseIndentButton();
        wysiwygEditorPage.setTextArea(text2);
        assertEquals(wysiwygEditorPage.getTextArea(),"HelloWorld!","Text incorrect");
    }


    @Test
    public void testNestedFrames(){
        var framesPage = homePage.clickFramesLink();
        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Text incorrect for left frame");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Text incorrect for bottom frame");
    }
}
