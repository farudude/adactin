package WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WH {
public static void main(String args[]) throws Exception{
System.setProperty("webdriver.gecko.driver", "F:\\STUDIES\\Selenium tools\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//1st wind
driver.get("file://F:/multiplewindows.html");
Thread.sleep(3000);
//2nd Wind
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
//3rd wind
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);

ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
driver.switchTo().newWindow(WindowType.TAB);
driver.switchTo().newWindow(WindowType.WINDOW);
//driver.switchTo().window(originalWindow);
Thread.sleep(3000);
//driver.close(); //to close current/active browser
driver.quit();//to close all browsers opened by webdriver instance


}
}



