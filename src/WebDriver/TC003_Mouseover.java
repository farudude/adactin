package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC003_Mouseover
{
    static String un="admin";
    static String pw="";
    static String url="http://127.0.0.1/orangehrm-2.6/login.php";
    
public static void main(String[] args) throws Exception 
{
	 System.setProperty("webdriver.gecko.driver", "F:\\STUDIES\\Selenium tools\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 Thread.sleep(3000);
	 driver.navigate().to(url);
	 System.out.println(driver.getTitle());
	 driver.findElement(By.name("txtUserName")).sendKeys(un);
	 
	 driver.findElement(By.name("Submit")).click();
	 Alert a= driver.switchTo().alert();
	 System.out.println(a.getText());
	 Thread.sleep(3000);
	 a.accept();
	 driver.findElement(By.name("txtPassword")).sendKeys(un);
	 driver.findElement(By.name("Submit")).click();
	 System.out.println("Login Completed");
	 Thread.sleep(3000);
	 
	 Actions ac= new Actions(driver);
	 ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	 
	 Thread.sleep(3000);
	 
	 
	 driver.findElement(By.linkText("Add Employee")).click();
	 Thread.sleep(3000);
	//driver.switchTo().frame("rightMenu");
	 driver.findElement(By.linkText("Logout")).click();
	 driver.quit();
	 
	 
	 
	 
}
}
