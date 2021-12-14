package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    @FindBy(className = "figure")
    List<WebElement> figureBoxes;

    @FindBy(className = "figcaption")
    WebElement boxCaption;

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public Captions hoverOverBoxIndex(int index){
        /*Use Actions class moveToElement method to hover over an element. Perform method is required to perform the action*/
        Actions actions = new Actions(driver);
        actions.moveToElement(figureBoxes.get(index-1)).perform();
        return new Captions(boxCaption);
    }

    public class Captions{
        private WebElement captions;

        public Captions(WebElement boxCaption){
            this.captions = boxCaption;
        }

        public String getUsername(){
            return captions.findElement(By.tagName("h5")).getText();
        }

        public String getUserLinkURL(){
            return captions.findElement(By.tagName("a")).getAttribute("href");
        }

        public String getUserLinkText(){
            return captions.findElement(By.tagName("a")).getText();
        }

    }


}
