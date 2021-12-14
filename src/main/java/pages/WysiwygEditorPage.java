package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WysiwygEditorPage {
    private WebDriver driver;

    @FindBy (id = "mce_0_ifr")
    private WebElement iFrame;

    @FindBy (id = "tinymce")
    private WebElement textArea;

    @FindBy (xpath = ".//button[@aria-label='Increase indent']")
    private WebElement increaseIndentButton;

    public WysiwygEditorPage(WebDriver driver){
        this.driver=driver;
    }

    private void switchToIframe(){
        driver.switchTo().frame(iFrame);
    }

    private void switchToMainPage(){
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text){
        switchToIframe();
        textArea.sendKeys(text);
        switchToMainPage();
    }

    public String getTextArea(){
        switchToIframe();
        String text = textArea.getText();
        switchToMainPage();
        return text;
    }

    public void clickIncreaseIndentButton(){
        increaseIndentButton.click();
    }

    public void clearTextArea() {
        switchToIframe();
        textArea.clear();
        switchToMainPage();
    }
}
