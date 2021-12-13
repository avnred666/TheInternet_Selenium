package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdownSelectedOption(){
        String option = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.findSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect number of options selected");
        assertTrue(selectedOptions.contains(option),"Incorrect option selected!");
    }
}
