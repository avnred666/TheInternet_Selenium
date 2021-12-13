package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage {
    private WebDriver driver;

    @FindBy(id = "flash")
    private WebElement statusAlert;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return (statusAlert.getText());
    }
}
