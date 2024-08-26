package module_4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Module-4
Module 4_Selenium_Searching_Element_xpath
Assignment-1
1.	Automate Facebook Registration Page  using Direct Locator's in Chrome Browser
     https://www.facebook.com/
 */
public class A1_FbRegPage_DirectLoc {

	public static void main(String[] args) throws InterruptedException {

//TC1- Launch Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
//TC2- Go to the Url  https://www.facebook.com
		driver.get("https://www.facebook.com");
//Wait time 3sec
		Thread.sleep(3000);		
//TC3 - Maximize the window
		driver.manage().window().maximize();
//TC4 Navigate to facebook registration page	
		driver.findElement(By.linkText("Create new account")).click();
//Wait time 3sec
		Thread.sleep(3000);			
		
		
// Close the browser
		driver.quit();
	}

}
