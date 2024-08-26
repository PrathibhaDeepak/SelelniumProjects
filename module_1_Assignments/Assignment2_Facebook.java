package module_1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
https://www.facebook.com/
-Click on  CreateNew Account Button
-Click on DataPolicy Linktext

TS1: Launch the Browser
TS2: Go to the Url
TS3: Maximize the window
TS4: Click on CreateNew Account Button
TS5: Click on Privacy Policy/DataPolicy Linktext
TS6: Close the Browser

 */
public class Assignment2_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		//TS1: Launch the Browser
		System.getProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		
		//TS2: Go to the Url
		driver.get("https://www.facebook.com/");
		//Wait 3sec
		Thread.sleep(3000);
		
		//Maximize the window
		driver.manage().window().maximize();
		
	//Click on the Create new Account button	
	WebElement	newAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	newAcc.click();
	
	//Wait 3sec
	Thread.sleep(3000);
	// Click on PrivacyPlolicy/DataPolicy Linktext
	driver.findElement(By.linkText("Privacy Policy")).click();
	
	//wait 5sec
	Thread.sleep(5000);
	
	System.out.println("Test Passed!");
	
	
	// Close the Browser
	driver.quit();
		
		

	}

}
