package WebDriver;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC002 {

	static String un="admin";
	static String pw="admin";
	static String url="http://127.0.0.1/orangehrm-2.6/login.php";
	
	
	public static void main(String[] args) throws Exception
	{
		
		     System.setProperty("webdriver.gecko.driver", "F:\\STUDIES\\Selenium tools\\geckodriver.exe");
	   WebDriver driver= new FirefoxDriver();
	   // Navigate to orange hrms page
	   driver.navigate().to(url);  
	   // Thread.sleep(3000);// wait for 3sec
	   if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	   {
		  System.out.println("Verify ho gaya re baba ( title agaya)"); 
	   }
	   else
		   System.out.println("Verify ich nahi hua");
	   System.out.println(driver.getTitle());
				 Thread.sleep(5000);
	   // Login details enter username/ password and click on login 
	   driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
	   driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
	   driver.findElement(By.xpath("//input[@name='Submit']")).click();
	   
	   if(driver.getTitle().equals("OrangeHRM"))
	   {
		  System.out.println("Verify ho gaya re baba ( title agaya)"); 
	   }
	   else
		   System.out.println("Verify ich nahi hua");
	   System.out.println(driver.getTitle());
				 Thread.sleep(5000);
	    
	   Thread.sleep(3000);
	   
	   driver.findElement(By.linkText("Logout")).click();
	   Thread.sleep(3000);
	   driver.close();
}	
}
