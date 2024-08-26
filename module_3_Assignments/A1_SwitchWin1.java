package module_3_Assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* 
Module-3
Module 3_Selenium_Browser_Automation
*************************************
Assignment-1 

TC-1	Launch Chrome Browser
TC-2	Go to Test URL  https://demoqa.com/browser-windows
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on ReadMore/knowmore Link Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8	Switch from 1sr   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close all windows of Browser 
 */

public class A1_SwitchWin1 {

	public static void main(String[] args) throws InterruptedException {
		
		//TS1: Launch Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//TS2: Go to Url https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		//driver.get("https://www.toolsqa.com/"); to get ReadMore
		
		//Wait time 5sec
		Thread.sleep(5000);
		
		
		//TS3: Maximize the window
		driver.manage().window().maximize();
		
		//TS4: Get the Title of Page
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		

		//Wait time 5sec
		Thread.sleep(5000);
		
	//Click on New Window Button
		driver.findElement(By.id("windowButton")).click();
		
				
		//Wait time 5 sec
		Thread.sleep(5000);
		
		ArrayList<String> wins = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(wins);
		//Wait timw
		Thread.sleep(3000);
		
//Switch to 0th to 1st window
		System.out.println(driver.switchTo().window(wins.get(1)).getTitle());
		
		Thread.sleep(5000);
		//TS5: Click on the Read More/ knowmore Link Text
		//driver.findElement(By.xpath("//*[contains(text(),'Read More')]")).click();
	//	driver.findElement(By.linkText("Read More")).click();
		//Wait timw
				Thread.sleep(5000);
		driver.close();
		//Wait time 5sec
				Thread.sleep(5000);
//Switch to 1st to 0th
		driver.switchTo().window(wins.get(0));
		//Wait timw
				Thread.sleep(3000);
	//Close the browser
		driver.close();
		
	}

}
