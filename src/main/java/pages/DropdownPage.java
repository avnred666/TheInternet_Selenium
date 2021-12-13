package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;

    @FindBy(id = "dropdown")
    private WebElement dropdownBox;

    public DropdownPage (WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        Select dropdownElement = new Select(dropdownBox);
        dropdownElement.selectByVisibleText(option);
    }

    public List<String> findSelectedOption(){
        Select dropdownElement = new Select(dropdownBox);
        return dropdownElement.getAllSelectedOptions().stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
