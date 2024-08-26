package module_2_Assignments;
/*
 * Assignment:4
Convert following Test Cases into Test Scripts 

TC-1 Launch Edge Browser 
TC-2 Goto Test URL https://www.google.com
TC-3 Specify Wait Time for 5 Sec
TC-4 Get the Title of Page into Console
TC-5 Close the Browser 
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign4_Edge_PageTitle {

	public static void main(String[] args) throws InterruptedException {

		//TS1: Launch Edge Browser
		System.getProperty("webdriver.edge.driver","C:\\Automation_Inteli\\SoftwareBackup\\edgedriver-v0.34.0-win-aarch64.zip");
		WebDriver driver = new EdgeDriver();
		
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
		 //Close Browser
		 //driver.close();
		 driver.quit();
	}

}
