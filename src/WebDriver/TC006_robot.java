package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC006_robot {

public static void main(String[] args) throws Exception
{
   
	     System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   // Navigate to orange hrms page
   driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");  
    Thread.sleep(3000);// wait for 3sec
    
   // Login details enter username/ password and click on login 
   driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
   Robot r= new Robot();
   r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
  // driver.findElement(By.xpath("//input[@name='Submit']")).click();
   //driver.findElement(By.xpath("//a[@id='welcome']")).click();
   Thread.sleep(4000);
   driver.findElement(By.linkText("Logout")).click();
}
}
