package Webdriver_test;
// frame in & out 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC004 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://localhost/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	driver.window().scrollby();

	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
	driver.switchTo().defaultContent();

}
}