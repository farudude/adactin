package Webdriver_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC008 {
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://localhost/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. ID");
	Thread.sleep(3000);
	driver.findElement(By.name("loc_name")).sendKeys("0062");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	
	}
}
