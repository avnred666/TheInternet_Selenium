package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DLExample2Page {
    private WebDriver driver;

    @FindBy(xpath = ".//div[@id='start']/button")
    private WebElement startBtn;

    @FindBy(id = "loading")
    private WebElement loadingFrame;

    @FindBy(id = "finish")
    private WebElement textOnFinish;

    public DLExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartBtn(){
        startBtn.click();
    }

    public String getMessageText(){
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(textOnFinish));
        return textOnFinish.getText();
    }

}
