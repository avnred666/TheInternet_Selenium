package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.chooseFileToUpload("D:\\IdeaProjects\\SeleniumFramework\\src\\main\\resources\\chromedriver.exe");
        fileUploadPage.submitFileToUpload();
        assertEquals(fileUploadPage.returnUploadedFileName(),"chromedriver.exe","File upload failed!");
    }
}
