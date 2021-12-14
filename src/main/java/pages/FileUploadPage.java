package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage {
    private WebDriver driver;

    @FindBy(id="file-upload")
    WebElement chooseFileInput;

    @FindBy(id="file-submit")
    WebElement fileUploadButton;

    @FindBy(id="uploaded-files")
    WebElement listUploadedFiles;

    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void chooseFileToUpload(String filePath){
        chooseFileInput.sendKeys(filePath);
    }
    public void submitFileToUpload(){
        fileUploadButton.click();
    }
    public String returnUploadedFileName(){
        return listUploadedFiles.getText();
    }
}
