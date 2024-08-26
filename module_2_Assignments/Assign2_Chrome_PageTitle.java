package module_2_Assignments;

/*
Assignment:2
Convert following Test Cases into Test Scripts

TC-1 Launch Chrome Browser 
TC-2 Goto Test URL https://www.google.com
TC-3 Specify Wait Time for 5 Sec
TC-4 Get the Title of Page into Console
TC-5 Close the Browser 
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2_Chrome_PageTitle {

	public static void main(String[] args) throws InterruptedException {

		//TS1: Launch Chrome Browser
		System.getProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Wait time 3sec
		Thread.sleep(3000);
		//TS2: Go to Test Url
		driver.get("https://www.google.com");
		
		//TS3: Wait time 5sec
		Thread.sleep(5000);
		
		//TS4: Get the Title of Page into Console
		
		 String pageTitle = driver.getTitle();
		 System.out.println(pageTitle);
		 
		 //Wait time 3sec
		 Thread.sleep(3000);
		 
		 driver.close();
	}

}
