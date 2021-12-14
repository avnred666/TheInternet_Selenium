package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage {
    private WebDriver driver;

    @FindBy(id="target")
    private WebElement enterTextField;

    @FindBy(id="result")
    private WebElement resultField;

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    public void sendText(String text){
        enterTextField.sendKeys(text);
    }

    public String returnEnteredText(){
        return resultField.getText();
    }

}
