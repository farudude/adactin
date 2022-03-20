package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Robot_1 {
public static void main(String args[]) throws Exception{
	
	  System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium tools\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
driver.navigate().to("https://www.google.com");
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
driver.close();

}
}



