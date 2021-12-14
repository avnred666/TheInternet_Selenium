package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    /**
     * Copy of this page's WebDriver
     */
    private WebDriver driver;

    /**
     * PageFactory model WebElement identification using @FindBy annotation
     */
    @FindBy(linkText = "Form Authentication")
    private WebElement formLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropDownlink;

    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPasswordLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversLink;

    @FindBy(linkText = "Key Presses")
    private WebElement keyPressesLink;

    /**
     * Constructor initializes the local copy of driver to the one passed from previous page/class
     * @param driver
     */
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @return object of the page to which we are navigating. Since we are using PageFactory annotations to identify elements, we are initiating a Pagefactory element for the page
     */
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

    public HoversPage clickHoversLink(){
        hoversLink.click();
        return PageFactory.initElements(driver,HoversPage.class);
    }

    public KeyPressesPage clickKeyPressesLink(){
        keyPressesLink.click();
        return PageFactory.initElements(driver,KeyPressesPage.class);
    }
}
