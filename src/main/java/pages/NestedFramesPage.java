package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramesPage {
    private WebDriver driver;

    @FindBy(name = "frame-left")
    private WebElement leftFrame;

    @FindBy(name = "frame-top")
    private WebElement topFrame;

    @FindBy(name = "frame-bottom")
    private WebElement bottomFrame ;

    @FindBy(tagName = "body")
    private WebElement body;

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    private void goInsideLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }

    private void goInsideBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    private void switchToMainPage(){
        driver.switchTo().parentFrame();
    }

    public String getLeftFrameText(){
        goInsideLeftFrame();
        String leftFrameText = body.getText();
        switchToMainPage();
        switchToMainPage();
        return leftFrameText;
    }

    public String getBottomFrameText(){
        goInsideBottomFrame();
        String bottomFrameText = body.getText();
        switchToMainPage();
        return bottomFrameText;
    }

}
