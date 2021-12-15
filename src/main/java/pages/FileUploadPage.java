package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

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
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(listUploadedFiles));
        return listUploadedFiles.getText();
    }
}
