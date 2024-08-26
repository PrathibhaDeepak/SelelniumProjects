package module_4_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment-4
1.	Write a Test Script to get no of links available on Facebook Page 
     https://www.facebook.com/ */

public class A3_LinkCount_FbReg {

	public static void main(String[] args) throws InterruptedException {
		
//TC1 Launch Chrome Browser		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC2 Go to the Url 
		driver.get("https://www.facebook.com/");
//TC3 Maximize the window
		driver.manage().window().maximize();
		
		//Wait time 5sec
		Thread.sleep(5000);
//TC4 Number of links available on Facebook page
		
		List<WebElement> nLinks = driver.findElements(By.tagName("a"));
		int linkCount = nLinks.size();	
		 
		System.out.println("Number of links on the Facebook Page: " + linkCount);
			
		//Wait time 5sec
		Thread.sleep(5000);

		
//Close the Browser
		driver.quit();

	}

	
}
