package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage {
    private WebDriver driver;

    @FindBy(linkText = "Click Here")
    private WebElement newWindowLnk;

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHere(){
        newWindowLnk.click();
    }
}
