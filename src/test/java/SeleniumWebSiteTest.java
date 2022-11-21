
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumWebSiteTest {

   protected static ChromeDriver driver;


   @BeforeClass
   public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver =  new ChromeDriver();
      driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
      driver.manage().window().setSize(new Dimension(1366, 768));
   }

   @Test
   public void home_oage(){

      driver.findElement(By.cssSelector("h1")).click();
      driver.findElement(By.cssSelector("h1")).click();
      driver.findElement(By.cssSelector("h1")).click();
      driver.findElement(By.cssSelector("h1")).click();
      driver.findElement(By.id("selenium_logo")).click();
      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
}

   @AfterClass
   public void tearDown(){
     driver.quit();
   }
}
