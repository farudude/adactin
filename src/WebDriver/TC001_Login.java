package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

public class TC001_Login 
{
		
public static void main(String[] args) 
{
   
	     System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   // Navigate to orange hrms page
   driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");  
   // Thread.sleep(3000);// wait for 3sec
    
   // Login details enter username/ password and click on login 
   driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@name='Submit']")).click();
   driver.switchTo().frame("rightMenu");
   //System.out.println(driver.findElement(By.xpath("//input[@id='standardView']/div[2]/label[2]")).getCssValue("font-size"));
		 //  System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[1]/td[3]/a")).getCssValue("font-colour"));
		  driver.findElement(By.xpath("//h2[text()='Employee Information']")).getCssValue("font-type");
		
driver.switchTo().defaultContent();
System.out.println(driver.findElement(By.linkText("Logout")).getAttribute("href"));
driver.close();
   }
}

