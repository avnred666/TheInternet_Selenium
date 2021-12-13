package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {
    private WebDriver driver;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="form_submit")
    private WebElement retrievePasswordButton;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailField(String email){
        emailField.sendKeys(email);
    }

    public String retrievePasswordButtonText(){
        return retrievePasswordButton.getText();
    }

}
