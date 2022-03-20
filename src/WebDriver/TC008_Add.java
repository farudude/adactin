package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC008_Add {

	static String un="admin";
	static String pw="admin";
	static String url="http://127.0.0.1/orangehrm-2.6/login.php";
	

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\STUDIES\\Selenium Tools\\chromedriver.exe");// opening chrome browser 
		System.out.println("Chrome browser Opened");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(url);// opening the proposed website
		System.out.println("HRMS page opened");
		Thread.sleep(3000);// wait for sometime
		System.out.println("Title of the page is==> "+driver.getTitle()); //title of the page
		driver.findElement(By.name("txtUserName")).sendKeys(un);//enter the username on the login page
		driver.findElement(By.name("txtPassword")).sendKeys(pw);// enter the password on the login page
		driver.findElement(By.name("Submit")).click();// enter the login button
		
		driver.switchTo().frame("rightMenu");// entered into frame 
		//driver.findElement(By.xpath("//input[@value='0004'][@class='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click(); //find the button of add in the frame
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Faru");// enter the employee first name
		driver.findElement(By.name("txtEmpLastName")).sendKeys("mama");//enter the employee last name
		//ADD PHOTO
		WebElement fileInput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
				fileInput.sendKeys("F:\\pic3.jpg");
		
		driver.findElement(By.id("btnEdit")).click();// click save button for saving the entered data
		driver.switchTo().defaultContent();// exit from the frame
		driver.navigate().back();
		driver.findElement(By.linkText("Logout")).click();  // Click on logout link
	
		driver.quit();// close the chrome driver
		}
		
		
}

