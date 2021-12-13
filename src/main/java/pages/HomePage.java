package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    private WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropDownlink;

    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPasswordLink;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormLink (){
        formLink.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }

    public DropdownPage clickDropdownLink(){
        dropDownlink.click();
        return PageFactory.initElements(driver,DropdownPage.class);
    }

    public ForgotPasswordPage clickForgotPasswordLink(){
        forgotPasswordLink.click();
        return PageFactory.initElements(driver,ForgotPasswordPage.class);
    }
}
