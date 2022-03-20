package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_ggl  {
public static void main(String args[]) throws Exception{
System.setProperty("webdriver.gecko.driver", "F:\\STUDIES\\Selenium tools\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
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



