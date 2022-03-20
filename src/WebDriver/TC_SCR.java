package WebDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_SCR {
public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try                
        {
          driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
          driver.manage().window().minimize();
          driver.findElement(By.name("txtUserName")).sendKeys("admin");
          driver.findElement(By.name("txtPassword")).sendKeys("admin");
          driver.findElement(By.name("Submit")).click();
          Thread.sleep(3000);
         
          WebElement element = driver.findElement(By.linkText("PIM"));
          Actions action = new Actions(driver);
          action.moveToElement(element).perform();
          Thread.sleep(3000L);
          driver.findElement(By.linkText("Add Employee123")).click();
          Thread.sleep(4000);
          System.out.println("Clicked on submenu");                
          //driver.findElement(By.linkText("Logout")).click();
        }
        
        catch(Exception e)                
        {
        	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(f1, new File("F:\\TestResults-1.jpg"));
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();
}
}



