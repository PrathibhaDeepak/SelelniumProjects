package module_5_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
/*
 * Assignment-5

	Step-1 Launch Firefox Browser
	Step-2 Open Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt  in Chrome Browser
	Step-3 Switch into Frame 
	Step-3 Click on  Try it  Button 
	Step-4 Send the text into Alert 
	Step-5 Accept  the Web Alert 
	Step-6 Get the text displayed on page into Console 
	Step-7 Close Browser	
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5_Frames_Firefox {

	public static void main(String[] args) throws InterruptedException {
//TS1: Launch Firefox Browser
		System.getProperty("webdriver.geckodriver.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//TS2: Go to the Url 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//driver.get("https://www.google.com/");
		//Wait time 3sec
		Thread.sleep(3000);
		
					
//TS3: Maximize browser window
		driver.manage().window().maximize();
		//Wait time 3sec
		Thread.sleep(3000);
		
//TS-4 Switch into Frame
		driver.switchTo().frame("iframeResult");
		//Wait time 3sec
			Thread.sleep(3000);
//TS-5 Click on Try it button	
			driver.findElement(By.xpath("//*[text()='Try it']")).click();
		//Wait time 3sec
		Thread.sleep(3000);
//TS-6 Send the text into Alert
		driver.switchTo().alert().sendKeys("BahuBali");
		
		//Wait time 3sec
		Thread.sleep(3000);

		
//TS-7  Get the text displayed on page into Console
		Alert txt1 = driver.switchTo().alert();
		System.out.println(txt1.getText());
		
//TS-9  Accept  the Web Alert 
				driver.switchTo().alert().accept();
//TS10: Close the Browser
		//driver.close();
		driver.quit();
					
		
		
		
		
		
	}

}
