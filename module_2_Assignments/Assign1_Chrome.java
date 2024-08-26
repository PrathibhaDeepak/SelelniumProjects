package module_2_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Module-2
Module 2_Selenium_web_Driver_Automation
****************************************
Assignment:1
Write a Test Script to open  Test URL  in  Chrome Browser 
Write a Test Script to open  Test URL  in  Firefox Browser -------
Write a Test Script to open  Test URL  in  Edge Browser 

 */
public class Assign1_Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Open  Test URL  in  Chrome Browser 
		System.getProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		System.out.println("1: Chrome Browser");
		
		
		

		//wait 5sec
				Thread.sleep(5000);

				driver.quit();
	}

	

}
