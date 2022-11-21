package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureArea {
    WebDriver driver;
    private By logoutButton =  By.cssSelector("#content a");
   public  WebElement logoutButtonElement;
    public SecureArea(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogoutButton(){
        driver.findElement(logoutButton).click();
    }
    public void getLogOutButton(){
     logoutButtonElement =    driver.findElement(logoutButton);
    }
}
