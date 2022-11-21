package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
       clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
 public Hovers clickHover() {
        clickLink("Hovers");
        return new Hovers(driver);
    }


    private void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
