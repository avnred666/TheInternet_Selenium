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

    @FindBy(linkText = "JavaScript Alerts")
    private WebElement jsAlertsLink;

    @FindBy(linkText = "File Upload")
    private WebElement fileUploadLink;

    @FindBy(linkText = "WYSIWYG Editor")
    private WebElement wysiwygEditorLink;

    @FindBy(linkText = "Frames")
    private WebElement framesLink;

    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoadingLink;

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

    public JavaScriptAlertsPage clickJSAlertsLink(){
        jsAlertsLink.click();
        return PageFactory.initElements(driver,JavaScriptAlertsPage.class);
    }

    public FileUploadPage clickFileUploadLink(){
        fileUploadLink.click();
        return PageFactory.initElements(driver,FileUploadPage.class);
    }

    public WysiwygEditorPage clickWysiwygEditorLink(){
        wysiwygEditorLink.click();
        return PageFactory.initElements(driver,WysiwygEditorPage.class);
    }

    public FramesPage clickFramesLink(){
        framesLink.click();
        return PageFactory.initElements(driver,FramesPage.class);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        dynamicLoadingLink.click();
        return PageFactory.initElements(driver,DynamicLoadingPage.class);
    }
}
