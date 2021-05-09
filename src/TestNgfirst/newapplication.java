package TestNgfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newapplication
{

	WebDriver driver;
	
	 
	 @Test
		public void loginpage() {
		 System.setProperty("webdriver.chrome.driver", "F:\\newspace\\chromedriver.exe");
			
			
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
	 }
	 
	 @Test
	  private void login() {
		 
		 driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("admin");
		 
		 
		
	}
	 
		}
	 
