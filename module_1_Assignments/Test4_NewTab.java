package module_1_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_NewTab {

	public static void main(String[] args) throws InterruptedException {
		

		//TS1: Launch Chrome Browser
		System.getProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// TS2: Go to Test Url
		driver.get("https://www.selenium.com");
		
		//Wait Time
		Thread.sleep(5000);
		
		//TS3: Create New Tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//TS4: Create New Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.quit();
		
				
		
	}

}
