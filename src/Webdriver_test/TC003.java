package Webdriver_test;
//MouseHover

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC003 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://localhost/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	//WebElement element=driver.findElement(By.linkText("Performance"));
	Actions action=new Actions(driver);
	
	action.moveToElement(driver.findElement(By.linkText("Leave"))).perform();
	Thread.sleep(3000);
	action.moveToElement(driver.findElement(By.linkText("Leave Summary"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Employee Leave Summary")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	

}
}
