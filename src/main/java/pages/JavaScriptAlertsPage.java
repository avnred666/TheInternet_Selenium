package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage {
    private WebDriver driver;

    @FindBy(xpath=".//button[text()='Click for JS Alert']")
    WebElement clickForJSAlertButton;

    @FindBy(xpath=".//button[text()='Click for JS Confirm']")
    WebElement clickForJSConfirmButton;

    @FindBy(xpath=".//button[text()='Click for JS Prompt']")
    WebElement clickForJSPromptButton;

    @FindBy(id="result")
    WebElement resultOnPageField;


    public JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void buttonJSAlertClick(){
        clickForJSAlertButton.click();
    }

    public void buttonJSConfirmClick(){
        clickForJSConfirmButton.click();
    }

    public void buttonJSPromptClick(){
        clickForJSPromptButton.click();
    }

    public void clickOKOnJSAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickCancelOnJSConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void enterTextForJSPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String resultOnPage(){
        return resultOnPageField.getText();
    }

}
