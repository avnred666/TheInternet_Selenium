package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
    private WebDriver driver;

    @FindBy (linkText = "Nested Frames")
    private WebElement nestedFramesLink;

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesLink(){
        nestedFramesLink.click();
        return PageFactory.initElements(driver,NestedFramesPage.class);
    }
}
