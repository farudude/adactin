package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("cooldudefro@gmail.com");
	
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("...")).click();
	driver.findElement(By.xpath("//*[@id=\"mount_0_0_D0\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).click();
	
	driver.findElement(By.xpath("//*[@id=\"mount_0_0_D0\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("kiran");
	
}
}
