package Webdriver_test;
// Title matching

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;

public class TC002 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		System.out.println("Title matched");
	else
		System.out.println("Title mismatch");
	
//	driver.findElement(By.linkText("Logout")).click();
	driver.close();
		
}
}
