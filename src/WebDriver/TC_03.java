package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class TC_03 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://STUDIES//Selenium Tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.google.com");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("The number of links is " + allLinks.size());
	
	 for(WebElement link:allLinks){
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	
	 }
	//System.out.println(driver.findElement(By.tagName("a")).getText());
	 
	 driver.close();
	
}
}











