package module_3_Assignments;
/*
Assignment-2

TC-1	Launch Chrome Browser
TC-2	Go to Test URL https://demoqa.com/browser-windows
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on new window/new tab Link Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8    Close 1st Window 
TC-8	Switch from 1st   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close 0th Window  
*/

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		
//TC-1	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-2	Go to Test URL https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		
//Wait time 3sec
		Thread.sleep(3000);
//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();		
		//Wait time 3sec
				Thread.sleep(3000);		
//TC-4	Get the Title of Page
		String title = driver.getTitle();
		System.out.println(title);
//Wait time 5sec
		Thread.sleep(5000);	
		////driver.findElement(By.xpath("//*[text()='New Window']")).sendKeys(Keys.PAGE_DOWN);
//TC-5	Click on new window/new tab 
		
		//Wait time 3 sec
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='New Window']")).click();
		//WebElement NewB = driver.findElement(By.id("windowButton"));
		//NewB.click();
		
		//Wait time 5sec
			Thread.sleep(5000);
			
//Handling multiple tabs
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs);

//Wait time 5sec
			Thread.sleep(5000);			
//TC-6	Switch from 0th   Window to 1st   Window	
			driver.switchTo().window(tabs.get(1));
			
//Wait time 3sec
			Thread.sleep(3000);
//TC-7	After Switching Get the Title of Page 
// no title	
//TC-8 Close 1st window			
		driver.close();
		//Wait time 3sec
		Thread.sleep(3000);
//TC-8 Switch from 1st window to 0th window
		driver.switchTo().window(tabs.get(0));
		//Wait time 3sec
		Thread.sleep(3000);
		driver.quit();
		//driver.close();
		
	}

}
