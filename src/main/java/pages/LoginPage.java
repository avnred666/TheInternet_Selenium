package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(className = "fa-sign-in")
    private WebElement submitButton;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void setUsernameField(String username){
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public SecureAreaPage clickSubmitButton(){
        submitButton.click();
        return PageFactory.initElements(driver,SecureAreaPage.class);
    }

}
