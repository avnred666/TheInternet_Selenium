package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {
    private WebDriver driver;

    @FindBy(partialLinkText = "Example 1" )
    private WebElement example1Link;

    @FindBy(partialLinkText = "Example 2" )
    private WebElement example2Link;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DLExample1Page clickExample1(){
        example1Link.click();
        return PageFactory.initElements(driver,DLExample1Page.class);
    }

    public DLExample2Page clickExample2(){
        example2Link.click();
        return PageFactory.initElements(driver,DLExample2Page.class);
    }
}
