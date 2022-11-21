package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOptions(){
        String option = "Option 1";
         var dropdown =  homePage.clickDropDown();
         dropdown.selectFromDropDown(option);
         var selectedOptions = dropdown.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"option not selected");

    }
}
